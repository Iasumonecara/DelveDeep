package iasumonecara.DelveDeep;

import iasumonecara.DelveDeep.blocks.naturalBasaltBlock;
import iasumonecara.DelveDeep.blocks.naturalMarbleBlock;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="DelveDeep", name="DelveDeep", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)


public class DelveDeep {
	
    @Instance("DelveDeep")
    public static DelveDeep instance;
    
    @SidedProxy(clientSide="iasumonecara.DelveDeep.client.ClientProxy",
                    serverSide="iasumonecara.DelveDeep.CommonProxy")
    public static CommonProxy proxy;
    public static Block naturalBasalt;
    public static Block naturalMarble;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
   //     Block naturalBasalt = new GenericNaturalStone(500, 2, Material.rock)
   //     	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep).setResistance(5.0F);

   //     Block naturalMarble = new GenericNaturalStone(501, 1, Material.rock)
	//		.setHardness(0.5F).setStepSound(Block.soundStoneFootstep).setResistance(5.0F);
        naturalBasalt = new naturalBasaltBlock(500, "naturalBasalt").setUnlocalizedName("naturalBasalt").setHardness(3.0F).setResistance(10.0F);
        naturalMarble = new naturalMarbleBlock(501, "naturalMarble").setUnlocalizedName("naturalMarble").setHardness(3.0F).setResistance(10.0F);
        

        LanguageRegistry.addName(naturalBasalt, "Natural Basalt");
        MinecraftForge.setBlockHarvestLevel(naturalBasalt, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBasalt, "naturalBasalt");
            
        LanguageRegistry.addName(naturalMarble, "Natural Marble");
        MinecraftForge.setBlockHarvestLevel(naturalMarble, "pickaxe", 3);
        GameRegistry.registerBlock(naturalMarble, "naturalMarble");
            // End Basic Blocks
            
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}