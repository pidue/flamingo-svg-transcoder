/**
 * Copyright 2012 Emmanuel Bourg
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

package org.pushingpixels.flamingo.api.svg.transcoders;

import java.awt.geom.Line2D;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Transcodes a line.
 *
 * @author Emmanuel Bourg
 * @version $Revision$, $Date$
 */
public class LineTranscoder extends Transcoder<Line2D.Float> {

    public static LineTranscoder INSTANCE = new LineTranscoder();

    @Override
    public void transcode(Line2D.Float line, PrintWriter output) {
        output.format(Locale.ENGLISH, "shape = new Line2D.Float(%ff, %ff, %ff, %ff);\n", line.x1, line.y1, line.x2, line.y2);
    }
}
