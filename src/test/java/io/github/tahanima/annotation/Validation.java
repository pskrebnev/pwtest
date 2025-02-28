package io.github.tahanima.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;


@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Regression
@Tag("validation")
public @interface Validation {}
