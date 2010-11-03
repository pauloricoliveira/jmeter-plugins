package kg.apc.jmeter.vizualizers;

import kg.apc.jmeter.vizualizers.AbstractGraphPanelVisualizerTest.AbstractGraphPanelVisualizerImpl;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.property.LongProperty;
import kg.apc.jmeter.util.TestJMeterUtils;
import org.apache.jmeter.samplers.SampleResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apc
 */
public class TimesVsThreadsGuiTest
{
   /**
    *
    */
   public TimesVsThreadsGuiTest()
   {
   }

   /**
    *
    * @throws Exception
    */
   @BeforeClass
   public static void setUpClass()
        throws Exception
   {
      TestJMeterUtils.createJmeterEnv();
   }

   /**
    *
    * @throws Exception
    */
   @AfterClass
   public static void tearDownClass()
        throws Exception
   {
   }

   /**
    *
    */
   @Before
   public void setUp()
   {
   }

   /**
    *
    */
   @After
   public void tearDown()
   {
   }

   /**
    * Test of getLabelResource method, of class TimesVsThreadsGui.
    */
   @Test
   public void testGetLabelResource()
   {
      System.out.println("getLabelResource");
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      String expResult = "TimesVsThreadsGui";
      String result = instance.getLabelResource();
      assertEquals(expResult, result);
   }

   /**
    * Test of getStaticLabel method, of class TimesVsThreadsGui.
    */
   @Test
   public void testGetStaticLabel()
   {
      System.out.println("getStaticLabel");
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      String expResult = "Response Times vs Threads";
      String result = instance.getStaticLabel();
      assertEquals(expResult, result);
   }

   /**
    * Test of add method, of class TimesVsThreadsGui.
    */
   @Test
   public void testAdd()
   {
      System.out.println("add");
      SampleResult res = new SampleResult();
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      instance.add(res);
      instance.add(res);
   }

   @Test
   public void testCreateTestElement()
   {
      System.out.println("createTestElement");
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      TestElement result = instance.createTestElement();
      assertNotNull(result);
   }

   @Test
   public void testModifyTestElement()
   {
      System.out.println("modifyTestElement");
      TestElement c = new ResultCollector();
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      instance.modifyTestElement(c);
   }

   @Test
   public void testConfigure()
   {
      System.out.println("configure");
      TestElement el = new ResultCollector();
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      instance.configure(el);
   }

   @Test
   public void testGetSettingsPanel()
   {
      System.out.println("getSettingsPanel");
      TimesVsThreadsGui instance = new TimesVsThreadsGui();
      JSettingsPanel expResult = null;
      JSettingsPanel result = instance.getSettingsPanel();
      assertEquals(expResult, result);
      fail("The test case is a prototype.");
   }
}
