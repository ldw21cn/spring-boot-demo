package tech.liangfang.springbootdemoeasycode.controller;

import tech.liangfang.springbootdemoeasycode.entity.Student;
import tech.liangfang.springbootdemoeasycode.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-02-13 17:28:49
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Student selectOne(@PathVariable("id") Integer id) {
        return this.studentService.queryById(id);
    }

}
