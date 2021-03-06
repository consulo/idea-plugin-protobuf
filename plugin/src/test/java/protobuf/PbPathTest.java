package protobuf;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import junit.framework.Assert;
import protobuf.util.PbTestUtil;

import java.io.File;
import java.io.IOException;

/**
 * @author Nikolay Matveev
 */

public abstract class PbPathTest extends LightPlatformCodeInsightFixtureTestCase
{

    public void testTestDataPath() throws IOException {        
        Assert.assertTrue("error with determining your test data path. Please, check your system settings.",PbTestUtil.getTestDataPath() != null);        
        Assert.assertTrue("path to testdata folder is not existed",new File(PbTestUtil.getTestDataPath()).exists());
    }
}
