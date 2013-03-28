package iasumonecara.DelveDeep;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class GenericNaturalStone extends Block {

        public GenericNaturalStone (int id, int texture, Material material) {
                super(id, Material.rock);
                this.setCreativeTab(CreativeTabs.tabBlock);
        }
        



//		public GenericOre(int id, int texture, Material material) {
//            super(id, texture, material);
//            
//            setHardness(4.0F); // 33% harder than diamond
//            setStepSound(Block.soundStoneFootstep);
//            setBlockName("genericOre");
//            setCreativeTab(CreativeTabs.tabBlock);
//    }
    

		@Override 
        public void registerIcons(IconRegister par1IconRegister)
        {
          this.blockIcon = par1IconRegister.registerIcon("DelveDeep:blockGabbro");
        }

}


