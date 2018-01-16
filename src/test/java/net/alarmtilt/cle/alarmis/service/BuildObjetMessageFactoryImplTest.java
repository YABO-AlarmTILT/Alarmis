package net.alarmtilt.cle.alarmis.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

import net.alarmtilt.cle.alarmis.model.AlertMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class BuildObjetMessageFactoryImplTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuildObjetMessageFactoryImplTest.class);

	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testParseXMLFile() throws ParserConfigurationException, SAXException, IOException {

		LOG.info(" test ParseXMLFile ");
		String fXmlStr = "<?xml version=\"1.0\" encoding=\"utf-8\"?><a><b></b><c></c></a>";
		LOG.info("String to converte : "+fXmlStr);
		AlertMessage alertMessage = buildObjetMessageFactoryService.parseXMLFile(fXmlStr);
		assertNotNull(alertMessage);

	}

}
