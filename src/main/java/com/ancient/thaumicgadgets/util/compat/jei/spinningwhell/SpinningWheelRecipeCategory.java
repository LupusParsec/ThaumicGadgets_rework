 package com.ancient.thaumicgadgets.util.compat.jei.spinningwhell;
 
 import com.ancient.thaumicgadgets.init.ModBlocks;
 import mezz.jei.api.IGuiHelper;
 import mezz.jei.api.gui.IDrawable;
 import mezz.jei.api.gui.IGuiItemStackGroup;
 import mezz.jei.api.gui.IRecipeLayout;
 import mezz.jei.api.ingredients.IIngredients;
 import mezz.jei.api.recipe.IRecipeWrapper;
 import net.minecraft.client.Minecraft;
 import net.minecraft.client.renderer.GlStateManager;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 
 
 
 
 public class SpinningWheelRecipeCategory
   extends AbstractSpinningWheelRecipeCategory<SpinningWheelRecipe>
 {
   private final IDrawable background;
   private final IDrawable icon;
   private final String name;
   
   public SpinningWheelRecipeCategory(IGuiHelper helper) {
/* 26 */     super(helper);
/* 27 */     this.background = (IDrawable)helper.createDrawable(TEXTURES, 0, 0, 150, 83);
/* 28 */     this.icon = helper.createDrawableIngredient(new ItemStack(Item.getItemFromBlock(ModBlocks.SPINNING_WHEEL)));
/* 29 */     this.name = "Spinning Wheel";
   }
 
 
   
   public IDrawable getBackground() {
/* 35 */     return this.background;
   }
 
 
   
   public void drawExtras(Minecraft minecraft) {
/* 41 */     GlStateManager.enableAlpha();
/* 42 */     GlStateManager.enableBlend();
/* 43 */     this.animatedProcess.draw(minecraft, 38, 15);
/* 44 */     GlStateManager.disableBlend();
/* 45 */     GlStateManager.disableAlpha();
   }
 
 
   
   public String getTitle() {
/* 51 */     return this.name;
   }
 
 
   
   public IDrawable getIcon() {
/* 57 */     return this.icon;
   }
 
 
 
   
   public String getModName() {
/* 64 */     return "Thaumic Gadgets";
   }
 
 
   
   public String getUid() {
/* 70 */     return "tg.spinning_wheel";
   }
 
 
   
   public void setRecipe(IRecipeLayout recipeLayout, SpinningWheelRecipe recipeWrapper, IIngredients ingredients) {
/* 76 */     IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
/* 77 */     stacks.init(0, true, 18, 8);
/* 78 */     stacks.init(1, true, 18, 24);
/* 79 */     stacks.init(2, true, 18, 41);
/* 80 */     stacks.init(3, true, 18, 57);
/* 81 */     stacks.init(4, false, 117, 39);
     
/* 83 */     stacks.set(ingredients);
   }
 }


/* Location:              C:\Users\戴尔\Desktop\code\Thaumic_Gadgets_1.12.2_0.1.6_tb.26.jar!\com\ancient\thaumicgadget\\util\compat\jei\spinningwhell\SpinningWheelRecipeCategory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */