import com.geekcattle.Application;
import com.geekcattle.mapper.website.CategoryMapper;
import com.geekcattle.mapper.website.ResourceMapper;
import com.geekcattle.mapper.website.RoleMapper;
import com.geekcattle.model.website.Category;
import com.geekcattle.model.website.Resource;
import com.geekcattle.model.website.Role;
import com.geekcattle.service.console.LogService;
import com.geekcattle.util.UuidUtil;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * author geekcattle
 * date 2016/10/21 0021 下午 16:54
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = Application.class)
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class TestApp extends TestCase {

    @Autowired
    JedisPool jedisPool;

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ResourceMapper resourceMapper;

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("geekcattle", "df1111111111111");
        Jedis jedis = jedisPool.getResource();
        jedis.setex("geek", 1000, "cattle");
        System.out.println(redisTemplate.opsForValue().get("geekcattle"));
    }


    @Test
    public void testInsertWebsiteRole() {
        Role role = new Role();
        role.setId(UuidUtil.getUUID());
        role.setCode("OrdinaryMember");
        role.setName("普通会员");
        roleMapper.insert(role);
    }

    @Test
    public void testInsertWebsiteCategory() {
        Category category = new Category();
        category.setId(UuidUtil.getUUID());
        category.setId("资源天地");
        categoryMapper.insert(category);
    }

    @Test
    public void testInsertWebsiteResource() {
        Resource resource = new Resource();
        resource.setId(UuidUtil.getUUID());
        resource.setTitle("手把手教你JAVA入门");
        resourceMapper.insert(resource);
    }

}
