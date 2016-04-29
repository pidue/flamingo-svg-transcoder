/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pushingpixels.flamingo.api.svg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author paolo
 */
public class CompositeTest extends TestCase {

    public void testNestedComposite() throws FileNotFoundException, IOException {
        File svg = new File("target/test-classes/svg/opacity.svg");
        File transcoded = new File(svg.getParentFile(), "opacity.java");
        PrintWriter out = new PrintWriter(transcoded);

        SvgTranscoder transcoder = new SvgTranscoder(svg.toURI().toURL(), "opacity");
        transcoder.setJavaPackageName("test.svg.transcoded");
        transcoder.setTemplate(new Template("resizable.template"));
        transcoder.setPrintWriter(out);

        transcoder.transcode();
        
        out.flush();
        out.close();
        
        assertTrue(transcoded.exists());
        
    }
}
