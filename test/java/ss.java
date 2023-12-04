//package test.java;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import your.package.Entity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class EntityController {
//
//    @Autowired
//    private EntityMapper entityMapper;
//
//    @GetMapping("/entities")
//    public List<Entity> getEntities(@RequestParam("condition1") List<String> condition1,
//                                    @RequestParam("condition2") List<String> condition2) {
//        QueryWrapper<Entity> wrapper = new QueryWrapper<>();
//        wrapper.in("field1", condition1); // 使用IN条件查询field1字段等于condition1中的任何一个值
//        wrapper.in("field2", condition2); // 使用IN条件查询field2字段等于condition2中的任何一个值
//        return entityMapper.selectList(wrapper);
//    }
//}

//
//List<DomainFile.ConvertedDomain>  convertedDomain = list.stream()
//        .map(domain -> new DomainFile.ConvertedDomain(domain.getDomain().toUpperCase()))
//        .collect(Collectors.toList());