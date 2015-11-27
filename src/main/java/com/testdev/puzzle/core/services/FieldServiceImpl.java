package com.testdev.puzzle.core.services;

import com.testdev.puzzle.core.domain.Field;
import com.testdev.puzzle.core.domain.UserLevel;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public class FieldServiceImpl implements FieldService {
    @Override
    public Field generateFieldByUserLevel(UserLevel level) {
        if (level == null) {
            throw new IllegalArgumentException("UserLevel should be selected to construct the field.");
        }
        return null;
    }
}
