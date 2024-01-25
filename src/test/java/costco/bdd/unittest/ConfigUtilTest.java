package costco.bdd.unittest;

import org.junit.Test;

import constant.FileName;
import constant.Key;
import util.ConfigUtil;

public class ConfigUtilTest {

	@Test
	public void initializingConfigUtil() {
		ConfigUtil util = new ConfigUtil(FileName.CONFIG_PROPERTIES);
		String urlValue = util.getPropertyValue(Key.BROWSER);
		System.err.println(urlValue);
	}
	
	//@Test
	public void nullFile() {
		ConfigUtil util = new ConfigUtil(null);
		String urlValue = util.getPropertyValue(Key.BROWSER);
		System.err.println(urlValue);
	}
}
