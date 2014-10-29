/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.processor;

import org.thymeleaf.aurora.engine.Attributes;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface IElementEventProcessor extends IElementProcessor {

    IElementEventProcessorResult processOpen(
            final String name, final Attributes attributes, final int line, final int col);

    IElementEventProcessorResult processStandalone(
            final String name, final Attributes attributes, final boolean minimized, final int line, final int col);

    IElementEventProcessorResult processClose(
            final String name, final int line, final int col);

}
