/*
 * Copyright Medical Research Council (c) 2018.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package uk.ac.mrc.har.impressclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static uk.ac.mrc.har.impressclient.Main.post;
import static uk.ac.mrc.har.impressclient.Main.restURL;
import uk.ac.mrc.har.impressclient.entities.OntologyGroup;
import uk.ac.mrc.har.impressclient.entities.OntologyTerm;
import uk.ac.mrc.har.impressclient.entities.ParamOntologyoption;
import uk.ac.mrc.har.impressclient.entities.Parameter;
import uk.ac.mrc.har.impressclient.entities.ParameterGroup;
import uk.ac.mrc.har.impressclient.entities.Procedure;
import uk.ac.mrc.har.impressclient.entities.Schedule;

/**
 * This class will contain various static methods which exist as sample
 * solutions to particular problems. They're not necessarily the most polished
 * code, but sometimes it's easier to explain with code than in plain text.
 */
public class MiscellaneousExamples {

    public static void main(String[] args) {
        parameterOntologyOptionExample();
    }

    public static void parameterOntologyOptionExample() {
        try {
            Parameter p = Main.get(Main.ItemType.PARAMETER, 37189);
            OntologyGroup grp = Main.get(Main.ItemType.ONTOLOGYGROUP, p.getOntologyGroupId());
            Collection<ParamOntologyoption> ooList = Main.post(Main.ItemType.PARAMONTOLOGYOPTION, grp.getParamOntologyoptionCollection());
            List<Integer> termIds = new ArrayList<>();
            ooList.stream().forEach(oo -> termIds.add(oo.getOntologyTermId()));
            Collection<OntologyTerm> termList = Main.post(Main.ItemType.ONTOLOGYTERM, termIds);
            for (OntologyTerm ot : termList) {
                System.out.println(ot.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(MiscellaneousExamples.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void parameterGroupExample() {
        try {
            Procedure p = Main.get(Main.ItemType.PROCEDURE, 944);
            Collection<Parameter> paramList = Main.post(Main.ItemType.PARAMETER, p.getParameterCollection());
            List<Integer> pgIdList = new ArrayList<>();
            paramList.stream().forEach(para -> pgIdList.add(para.getParameterGroup()));
            Collection<ParameterGroup> pgList = Main.post(Main.ItemType.PARAMETERGROUP, pgIdList);
            Map<Integer, ParameterGroup> pgMap = new HashMap<>();
            pgList.stream().forEach(pg -> pgMap.put(pg.getParameterGroupId(), pg));

            for (Parameter para : paramList) {
                Integer id = para.getParameterGroup();
                System.out.println("Parameter " + para.getParameterKey() + " is in parameter group " + id + ", " + pgMap.get(id).getName());
            }

        } catch (IOException ex) {
            Logger.getLogger(MiscellaneousExamples.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void EmbroyonicProceduresAllPipelines() {
        try {
            // Quick search for schedules that contain Embryonic procedures
            // This isn't an official documented API call as it's not the cleanest.. but it is handy.
            String json = HttpClient.getJSON(restURL + "schedule/listfields?f=scheduleId&f=stage");
            List items = JacksonConverter.fromJSON_objArray(json);
            List<Integer> schKeyList = new ArrayList<>();
            for (Object item : items) {
                List values = (List) item;
                if (values.get(1).toString().equals("E")) {
                    schKeyList.add((Integer) values.get(0));
                }
            }
            // Get just those schedules.
            List<Integer> procIDList = new ArrayList<>();
            Collection<Schedule> schList = post(Main.ItemType.SCHEDULE, schKeyList);

            // Get the IDs of the procedures they contain
            schList.stream().forEach(schedule -> procIDList.addAll(schedule.getProcedureCollection()));

            // Get the procedures.
            Collection<Procedure> procList = post(Main.ItemType.PROCEDURE, procIDList);

            // Do whatever you want with the procedures.
            procList.stream().forEach(procedure -> System.out.println(procedure.getProcedureKey()));

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
