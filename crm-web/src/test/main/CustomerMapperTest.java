import cn.sm1234.domain.Customer;
import cn.sm1234.mapper.CustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 18/3/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testSave(){
        Customer customer = new Customer();

        customer.setName("eric");
        customer.setGender("男");
        customer.setAge(20);

        customerMapper.save(customer);
    }
}
