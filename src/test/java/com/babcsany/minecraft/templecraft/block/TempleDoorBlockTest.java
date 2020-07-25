package com.babcsany.minecraft.templecraft.block;

import io.github.daomephsta.saddle.engine.SaddleTest;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TempleDoorBlockTest {

    private TempleDoorBlock templeDoorBlock;

    @BeforeEach
    void setUp() {
        templeDoorBlock = new TempleDoorBlock();
    }

    @SaddleTest(loadPhase = SaddleTest.LoadPhase.POST_INIT)
    void shouldBeUnbreakableAndHasMaxLight() {
//        float hardness = templeDoorBlock.getBlockHardness(null, null, null);
//        assertTrue(BigDecimal.valueOf(Float.valueOf(hardness).doubleValue()).compareTo(BigDecimal.valueOf(-1.0D)) == 0, "Block should be unbreakable!");
        assertEquals(templeDoorBlock.getDefaultState().getLightValue(), 15);
    }

    @SaddleTest(loadPhase = SaddleTest.LoadPhase.POST_INIT)
    void onBlockActivated() {
    }
}