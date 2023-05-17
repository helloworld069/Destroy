package com.petrolpark.destroy.client.gui;

import com.jozufozu.flywheel.util.Pair;
import com.mojang.blaze3d.vertex.PoseStack;
import com.petrolpark.destroy.chemistry.Atom;
import com.petrolpark.destroy.chemistry.Molecule;
import com.petrolpark.destroy.chemistry.Bond.BondType;

import mezz.jei.api.gui.drawable.IDrawable;
import net.minecraft.world.phys.Vec3;

public class JEIMoleculeRenderer extends MoleculeRenderer implements IDrawable {

    private static float angle;

    public JEIMoleculeRenderer(Molecule molecule) {
        super(molecule);
    };

    @Override
    public int getWidth() {
        return 32;
    };

    @Override
    public int getHeight() {
        return 32;
    };

    @Override
    public void draw(PoseStack poseStack, int xOffset, int yOffset) {
        poseStack.pushPose();
        angle += 1f;
        originX = xOffset;
        originY = yOffset;
        for (Pair<Vec3, Atom> pair : LOCATIONS_OF_ATOMS) {
            renderAtom(pair.second(), pair.first(), poseStack);
        };
        for (BondRenderInstance bond : BONDS) {
            renderBond(bond, poseStack);
        };
        poseStack.popPose();
    };
    
};
