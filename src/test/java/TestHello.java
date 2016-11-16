import com.sonia.lightspring.BeanConfiguration;
import com.sonia.lightspring.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfiguration.class})
@ActiveProfiles("dev")
public class TestHello {
    @Autowired
    HelloService helloService;

    @Test
    public void testSayHello(){
        String result = helloService.hello();
        Assert.assertEquals(result,"Hello dev");
    }
}
