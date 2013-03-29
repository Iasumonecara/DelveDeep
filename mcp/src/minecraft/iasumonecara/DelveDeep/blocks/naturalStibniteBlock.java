package iasumonecara.DelveDeep.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class naturalStibniteBlock extends Block{

	String texture;
	
	public naturalStibniteBlock(int par1, String texture) {
		super(par1, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.texture = texture;
		
	}

	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("DelveDeep:NaturalStibnite");
	}
}
