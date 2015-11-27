package services;

import com.testdev.puzzle.core.domain.Field;
import com.testdev.puzzle.core.domain.UserLevel;
import com.testdev.puzzle.core.services.FieldService;
import com.testdev.puzzle.core.services.FieldServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by oleh.krupenia on 11/8/2015.
 */
public class FieldServiceTest {
    private FieldService fieldService;

    @Before
    public void before() {
        this.fieldService = new FieldServiceImpl();
    }

    @Test
    public void shouldPopulateField9x9with10minesForLevelEasy() {
        Field generatedField = this.fieldService.generateFieldByUserLevel(UserLevel.EASY);
        Assert.assertEquals(9, generatedField.getRows());
        Assert.assertEquals(9, generatedField.getColumns());
        int mineCounter = 0;
        for (int i = 0; i < generatedField.getRows(); i++) {
            for (int j = 0; j < generatedField.getColumns(); j++) {
                if (!generatedField.getCells()[i][j].containsMine()) {
                    mineCounter++;
                }
            }
        }
        Assert.assertEquals(10, mineCounter);
    }

    @Test
    public void shouldPopulateField16x16with40minesForLevelMedium() {
        Field generatedField = this.fieldService.generateFieldByUserLevel(UserLevel.NORMAL);
        Assert.assertEquals(16, generatedField.getRows());
        Assert.assertEquals(16, generatedField.getColumns());
        int mineCounter = 0;
        for (int i = 0; i < generatedField.getRows(); i++) {
            for (int j = 0; j < generatedField.getColumns(); j++) {
                if (!generatedField.getCells()[i][j].containsMine()) {
                    mineCounter++;
                }
            }
        }
        Assert.assertEquals(40, mineCounter);
    }

    @Test
    public void shouldPopulateField16x30with99minesForLevelHard() {
        Field generatedField = this.fieldService.generateFieldByUserLevel(UserLevel.HARD);
        Assert.assertEquals(16, generatedField.getRows());
        Assert.assertEquals(30, generatedField.getColumns());
        int mineCounter = 0;
        for (int i = 0; i < generatedField.getRows(); i++) {
            for (int j = 0; j < generatedField.getColumns(); j++) {
                if (!generatedField.getCells()[i][j].containsMine()) {
                    mineCounter++;
                }
            }
        }
        Assert.assertEquals(99, mineCounter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfLevelIsNull() {
        this.fieldService.generateFieldByUserLevel(null);
    }

    @After
    public void after() {
        this.fieldService = null;
    }
}
