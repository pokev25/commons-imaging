/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.xbm;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingTest;

public abstract class XbmBaseTest extends ImagingTest {

    private static boolean isXbm(final File file) {
        return file.getName().toLowerCase().endsWith(".xbm");
    }

    private static final ImageFilter IMAGE_FILTER = new ImageFilter() {
        @Override
        public boolean accept(final File file) throws IOException, ImageReadException {
            return isXbm(file);
        }
    };

    protected List<File> getXbmImages() throws IOException, ImageReadException {
        return getTestImages(IMAGE_FILTER);
    }
}
