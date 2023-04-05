package com.petrolpark.destroy.advancement;

import com.petrolpark.destroy.Destroy;
import com.simibubi.create.foundation.advancement.SimpleCreateTrigger;

import net.minecraft.resources.ResourceLocation;

public class SimpleDestroyTrigger extends SimpleCreateTrigger {

    private ResourceLocation trueID;

    public SimpleDestroyTrigger(String id) {
        super(id);
        trueID = Destroy.asResource(id);
    };

    @Override
    public ResourceLocation getId() {
        return trueID;
    };
    
};
