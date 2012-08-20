/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kundera.metadata.model.type;

import java.util.Map;

import javax.persistence.metamodel.EmbeddableType;
import javax.persistence.metamodel.ManagedType;
import javax.persistence.metamodel.PluralAttribute;
import javax.persistence.metamodel.SingularAttribute;

/**
*  TODO::::: comments required.
 * @author vivek.mishra
 *
 */
public class DefaultEmbeddableType<X> extends AbstractManagedType<X> implements EmbeddableType<X>
{

    /**
     * @param clazz
     * @param persistenceType
     * @param superClazzType
     * @param declaredSingluarAttribs
     * @param declaredPluralAttributes
     */
    public DefaultEmbeddableType(Class<X> clazz, javax.persistence.metamodel.Type.PersistenceType persistenceType,
            ManagedType<? super X> superClazzType, Map<String, SingularAttribute<X, ?>> declaredSingluarAttribs,
            Map<String, PluralAttribute<X, ?, ?>> declaredPluralAttributes)
    {
        super(clazz, persistenceType, superClazzType, declaredSingluarAttribs, declaredPluralAttributes);
        // TODO Auto-generated constructor stub
    }

}