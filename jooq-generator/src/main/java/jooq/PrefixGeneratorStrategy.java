package jooq;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

/**
 * Appends a 'T' for Jooq Pojos names.
 */
public class PrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {
        switch (mode) {
            case POJO:
                return 'T' + super.getJavaClassName(definition, mode);
            default:
                return super.getJavaClassName(definition, mode);
        }
    }
}
