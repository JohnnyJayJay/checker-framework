package android.support.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface IntRange {
    long from() default Long.MIN_VALUE;

    long to() default Long.MAX_VALUE;
}
