package com.zjrc.springaop.common.aop;

import javax.xml.bind.Element;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionAnnotation {
}
