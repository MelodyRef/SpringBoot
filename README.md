# SpringBoot
@Pointcut 注解指定一个切点，定义需要拦截的东西，这里介绍两个常用的表达式：一个是使用 execution()，另一个是使用 annotation()。

execution表达式：

以 execution(* * com.mutest.controller..*.*(..))) 表达式为例：

第一个 * 号的位置：表示返回值类型，* 表示所有类型。
包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，在本例中指 com.mutest.controller包、子包下所有类的方法。
第二个 * 号的位置：表示类名，* 表示所有类。
*(..)：这个星号表示方法名，* 表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
annotation() 表达式：

annotation() 方式是针对某个注解来定义切点，比如我们对具有 @PostMapping 注解的方法做切面，可以如下定义切面：

@Pointcut("@annotation(org.springframework
.web.bind.annotation.PostMapping)")
public void annotationPointcut() {}
然后使用该切面的话，就会切入注解是 @PostMapping 的所有方法。这种方式很适合处理 @GetMapping、@PostMapping、@DeleteMapping不同注解有各种特定处理逻辑的场景。

还有就是如上面案例所示，针对自定义注解来定义切面。

@Pointcut("@annotation(com.example.demo.PermissionsAnnotation)")
private void permissionCheck() {}
