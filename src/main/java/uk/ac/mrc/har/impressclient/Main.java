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
import java.util.Collection;
import java.util.List;
import uk.ac.mrc.har.impressclient.entities.Increment;
import uk.ac.mrc.har.impressclient.entities.OntologyGroup;
import uk.ac.mrc.har.impressclient.entities.OntologyTerm;
import uk.ac.mrc.har.impressclient.entities.Option;
import uk.ac.mrc.har.impressclient.entities.ParamMpterm;
import uk.ac.mrc.har.impressclient.entities.ParamOntologyoption;
import uk.ac.mrc.har.impressclient.entities.Parameter;
import uk.ac.mrc.har.impressclient.entities.ParameterGroup;
import uk.ac.mrc.har.impressclient.entities.Parent;
import uk.ac.mrc.har.impressclient.entities.Pipeline;
import uk.ac.mrc.har.impressclient.entities.Procedure;
import uk.ac.mrc.har.impressclient.entities.Schedule;
import uk.ac.mrc.har.impressclient.entities.Section;
import uk.ac.mrc.har.impressclient.entities.Sop;
import uk.ac.mrc.har.impressclient.entities.Units;

public class Main {

    public static String restURL = "https://api.mousephenotype.org/impress/";

    /**
     * 
     * @param <T> A class with a corresponding ItemType
     * @param itemType The corresponding ItemType
     * @param id The id of the item you want.
     * @return An instance of the requested item
     * @throws IOException
     */
    public static <T> T get(ItemType itemType, int id) throws IOException {
        String json = HttpClient.getJSON(restURL + itemType.name().toLowerCase() + "/" + Integer.toString(id));
        return (T) JacksonConverter.fromJSON(json, itemType.getClazz());
    }
    /**
     * 
     * @param <T> A class with a corresponding ItemType
     * @param itemType The corresponding ItemType
     * @param ids A collection of the IDs you want
     * @return A collection of instances of the requested item
     * @throws IOException 
     */
    public static <T> Collection<T> post(ItemType itemType, Collection<Integer> ids) throws IOException {
        HttpClient.MyResponse rtns = HttpClient.postJSON(restURL + itemType.name().toLowerCase() + "/multiple", JacksonConverter.toJSON(ids));
        List<T> itemList = (List<T>) JacksonConverter.fromJSON_Collection(rtns.getBody(), itemType.getClazz());
        return itemList;
    }
    
    /**
     * Lists possible 'item' types.
     */
    public enum ItemType implements ItemInterface {
        INCREMENT {
            @Override
            public Class getClazz() {
                return Increment.class;
            }
        },
        ONTOLOGYGROUP {
            @Override
            public Class getClazz() {
                return OntologyGroup.class;
            }
        },
        ONTOLOGYTERM {
            @Override
            public Class getClazz() {
                return OntologyTerm.class;
            }
        },
        OPTION {
            @Override
            public Class getClazz() {
                return Option.class;
            }
        },
        PARAMETER {
            @Override
            public Class getClazz() {
                return Parameter.class;
            }
        },
        PARAMETERGROUP {
            @Override
            public Class getClazz() {
                return ParameterGroup.class;
            }
        },
        PARAMMPTERM {
            @Override
            public Class getClazz() {
                return ParamMpterm.class;
            }
        },
        PARAMONTOLOGYOPTION {
            @Override
            public Class getClazz() {
                return ParamOntologyoption.class;
            }
        },
        PARENT {
            @Override
            public Class getClazz() {
                return Parent.class;
            }
        },
        PIPELINE {
            @Override
            public Class getClazz() {
                return Pipeline.class;
            }
        },
        PROCEDURE {
            @Override
            public Class getClazz() {
                return Procedure.class;
            }
        },
        SCHEDULE {
            @Override
            public Class getClazz() {
                return Schedule.class;
            }
        },
        SECTION {
            @Override
            public Class getClazz() {
                return Section.class;
            }
        },
        SOP {
            @Override
            public Class getClazz() {
                return Sop.class;
            }
        },
        UNIT {
            @Override
            public Class getClazz() {
                return Units.class;
            }
        };
    }

    /**
     * Used only by the ItemType enum
     */
    interface ItemInterface {
        public Class getClazz();
    }
}
