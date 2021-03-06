/**
 * Copyright © 2018 Jesse Gallagher
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
package org.openntf.openliberty.domino;

import org.eclipse.core.runtime.Plugin;
import org.openntf.openliberty.domino.util.DominoThreadFactory;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {
	private static Activator instance;
	
	public static Activator getDefault() {
		return instance;
	}
	
	public Activator() {
		instance = this;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		DominoThreadFactory.init();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);

		DominoThreadFactory.term();
	}

}
