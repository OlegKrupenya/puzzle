package com.testdev.puzzle.services;

import com.testdev.puzzle.domain.Field;
import com.testdev.puzzle.domain.UserLevel;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public interface FieldService {
    Field generateFieldByUserLevel(UserLevel level);
}
