package ch.kup.coverage.integrationtests;

import ch.kup.sonar.prodcode.ProdClass;
import ch.kup.sonar.prodcode.SomeHelper;
import org.junit.jupiter.api.Test;

public class TestTheSystem {
    @Test
    void testTheWholeSystem() {
        SomeHelper someHelper = new SomeHelper();
        someHelper.getaField();
        ProdClass.main(new String[0]);
    }
}
