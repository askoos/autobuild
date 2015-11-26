package cnxj.askoos

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by Askoos on 2015/11/26.
 */
@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = AutobuildApplication)
@WebAppConfiguration
class AutobuildApplicationTests {

	@Test
	void contextLoads() {
	}

}
