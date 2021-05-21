package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;



public class RoastedCarrot extends Item {
    public RoastedCarrot() {
        super(new Properties()

                .group(ItemGroup.MISC)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.5F)
                        .build()
                ));
    }

}
