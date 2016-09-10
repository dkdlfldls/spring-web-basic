package product.config;

import org.hibernate.annotations.RowId;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ImportResource("classpath:/spring/application-config.xml")
public class ProductAppConf {

}
