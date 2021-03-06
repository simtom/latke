/*
 * Copyright (c) 2009-2018, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.ioc.annotated;

/**
 * <p>Represents a parameter of a method or constructor.</p>
 *
 * @param <X> the type that declares the method or constructor
 * @author Gavin King
 * @author Pete Muir
 */
public interface AnnotatedParameter<X> extends Annotated {

    /**
     * <p>Get the position of the parameter in the method or
     * constructor argument list.</p>
     *
     * @return the position of the parameter
     */
    public int getPosition();

    /**
     * <p>Get the declaring {@linkplain AnnotatedCallable method or
     * constructor}.</p>
     *
     * @return the declaring callable
     */
    public AnnotatedCallable<X> getDeclaringCallable();

}
