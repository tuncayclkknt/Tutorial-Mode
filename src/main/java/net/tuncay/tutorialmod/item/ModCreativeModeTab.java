package net.tuncay.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab")
    // add a new tab for creative mod
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
            //tab logo
        }
    };

}
