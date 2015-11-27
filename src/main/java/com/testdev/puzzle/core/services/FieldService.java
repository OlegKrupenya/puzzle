package com.testdev.puzzle.core.services;

import com.testdev.puzzle.core.domain.Field;
import com.testdev.puzzle.core.domain.UserLevel;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public interface FieldService {
    Field generateFieldByUserLevel(UserLevel level);
}
