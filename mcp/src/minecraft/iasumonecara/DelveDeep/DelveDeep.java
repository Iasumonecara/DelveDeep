package iasumonecara.DelveDeep;

import iasumonecara.DelveDeep.blocks.naturalBasaltBlock;
import iasumonecara.DelveDeep.blocks.naturalGraniteBlock;
import iasumonecara.DelveDeep.blocks.naturalMarbleBlock;
import iasumonecara.DelveDeep.items.BasicCircuit;
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

@Mod(modid="DelveDeep", name="DelveDeep", version="0.0.3")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)


public class DelveDeep {
	
	@Instance("DelveDeep")
    public static DelveDeep instance;
	private final static Item BasicCircuit = new BasicCircuit(5000);
    
    @SidedProxy(clientSide="iasumonecara.DelveDeep.client.ClientProxy",
                    serverSide="iasumonecara.DelveDeep.CommonProxy")
    public static CommonProxy proxy;
    
    //natural stone
    public static Block naturalAlabaster;
    public static Block naturalAlunite;
    public static Block naturalAnhydrite;
    public static Block naturalBasalt;
    public static Block naturalBauxite;
    public static Block naturalBismuthinite;
    public static Block naturalBitumousCoal;
    public static Block naturalBorax;
    public static Block naturalBrimstone;
    public static Block naturalCalcite;
    public static Block naturalCassiterite;
    public static Block naturalChalk;
    public static Block naturalChert;
    public static Block naturalChromite;
    public static Block naturalCinnabar;
    public static Block naturalClaystone;
    public static Block naturalCobaltite;
    public static Block naturalConglomerate;
    public static Block naturalCryolite;
    public static Block naturalDacite;
    public static Block naturalDiorite;
    public static Block naturalGabbro;
    public static Block naturalGalena;
    public static Block naturalGarnierite;
    public static Block naturalGranite;
    public static Block naturalGraphite;
    public static Block naturalGypsum;
    public static Block naturalHematite;
    public static Block naturalHornblende;
    public static Block naturalHornSilver;
    public static Block naturalIlmenite;
    public static Block naturalJet;
    public static Block naturalKaolinite;
    public static Block naturalKimberlite;
    public static Block naturalLignite;
    public static Block naturalLimestone;
    public static Block naturalLimonite;
    public static Block naturalMagnetite;
    public static Block naturalMalachite;
    public static Block naturalMarble;
    public static Block naturalMarcasite;
    public static Block naturalMica;
    public static Block naturalMicrocline;
    public static Block naturalMudstone;
    public static Block naturalNativeAluminum;
    public static Block naturalNativeCopper;
    public static Block naturalNativeGold;
    public static Block naturalNativePlatinum;
    public static Block naturalNativeSilver;
    public static Block naturalObsidian;
    public static Block naturalOlivine;
    public static Block naturalOrpiment;
    public static Block naturalOrthoclase;
    public static Block naturalPericlase;
    public static Block naturalPetrifiedWood;
    public static Block naturalPhyllite;
    public static Block naturalPitchblende;
    public static Block naturalPuddingstone;
    public static Block naturalPyrolusite;
    public static Block naturalQuartzite;
    public static Block naturalRawAdamantine;
    public static Block naturalRealgar;
    public static Block naturalRedstone;
    public static Block naturalRhyolite;
    public static Block naturalRockSalt;
    public static Block naturalRutile;
    public static Block naturalSaltpeter;
    public static Block naturalSandstone;
    public static Block naturalSatinspar;
    public static Block naturalSchist;
    public static Block naturalSelenite;
    public static Block naturalSerpentine;
    public static Block naturalShale;
    public static Block naturalSiltstone;
    public static Block naturalSlate;
    public static Block naturalSphalerite;
    public static Block naturalStibnite;
    public static Block naturalSylvite;
    public static Block naturalTalc;
    public static Block naturalTetrahedrite;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        naturalBasalt = new naturalBasaltBlock(500, "naturalBasalt").setUnlocalizedName("naturalBasalt").setHardness(3.0F).setResistance(10.0F);
        naturalMarble = new naturalMarbleBlock(501, "naturalMarble").setUnlocalizedName("naturalMarble").setHardness(3.0F).setResistance(10.0F);
        naturalGranite = new naturalGraniteBlock(502, "naturalGranite").setUnlocalizedName("naturalGranite").setHardness(3.0F).setResistance(10.0F);

        LanguageRegistry.addName(naturalBasalt, "Natural Basalt");
        MinecraftForge.setBlockHarvestLevel(naturalBasalt, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBasalt, "naturalBasalt");
            
        LanguageRegistry.addName(naturalMarble, "Natural Marble");
        MinecraftForge.setBlockHarvestLevel(naturalMarble, "pickaxe", 3);
        GameRegistry.registerBlock(naturalMarble, "naturalMarble");
        
        LanguageRegistry.addName(naturalGranite, "Natural Granite");
        MinecraftForge.setBlockHarvestLevel(naturalGranite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGranite, "naturalGranite");
        
        LanguageRegistry.addName(BasicCircuit, "Basic Circuit");
            // End Basic Blocks
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}