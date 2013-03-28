package iasumonecara.DelveDeep;

import iasumonecara.DelveDeep.items.BasicCircuit;
import iasumonecara.DelveDeep.items.ElectricMotor;
import iasumonecara.DelveDeep.items.ConduitBox;
import iasumonecara.DelveDeep.items.DrivePulley;
import iasumonecara.DelveDeep.items.Fan;
import iasumonecara.DelveDeep.items.InsulatedCopperWire;
import iasumonecara.DelveDeep.items.Insulation;
import iasumonecara.DelveDeep.items.UninsulatedCopperWire;
import iasumonecara.DelveDeep.items.Rotor;
import iasumonecara.DelveDeep.blocks.naturalAlabasterBlock;
import iasumonecara.DelveDeep.blocks.naturalAluniteBlock;
import iasumonecara.DelveDeep.blocks.naturalAnhydriteBlock;
import iasumonecara.DelveDeep.blocks.naturalBasaltBlock;
import iasumonecara.DelveDeep.blocks.naturalBauxiteBlock;
import iasumonecara.DelveDeep.blocks.naturalBismuthiniteBlock;
import iasumonecara.DelveDeep.blocks.naturalBitumousCoalBlock;
import iasumonecara.DelveDeep.blocks.naturalBoraxBlock;
import iasumonecara.DelveDeep.blocks.naturalBrimstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalCalciteBlock;
import iasumonecara.DelveDeep.blocks.naturalCassiteriteBlock;
import iasumonecara.DelveDeep.blocks.naturalChalkBlock;
import iasumonecara.DelveDeep.blocks.naturalChertBlock;
import iasumonecara.DelveDeep.blocks.naturalChromiteBlock;
import iasumonecara.DelveDeep.blocks.naturalCinnabarBlock;
import iasumonecara.DelveDeep.blocks.naturalClaystoneBlock;
import iasumonecara.DelveDeep.blocks.naturalCobaltiteBlock;
import iasumonecara.DelveDeep.blocks.naturalConglomerateBlock;
import iasumonecara.DelveDeep.blocks.naturalCryoliteBlock;
import iasumonecara.DelveDeep.blocks.naturalDaciteBlock;
import iasumonecara.DelveDeep.blocks.naturalDioriteBlock;
import iasumonecara.DelveDeep.blocks.naturalGabbroBlock;
import iasumonecara.DelveDeep.blocks.naturalGalenaBlock;
import iasumonecara.DelveDeep.blocks.naturalGarnieriteBlock;
import iasumonecara.DelveDeep.blocks.naturalGraniteBlock;
import iasumonecara.DelveDeep.blocks.naturalGraphiteBlock;
import iasumonecara.DelveDeep.blocks.naturalGypsumBlock;
import iasumonecara.DelveDeep.blocks.naturalHematiteBlock;
import iasumonecara.DelveDeep.blocks.naturalHornblendeBlock;
import iasumonecara.DelveDeep.blocks.naturalHornSilverBlock;
import iasumonecara.DelveDeep.blocks.naturalIlmeniteBlock;
import iasumonecara.DelveDeep.blocks.naturalJetBlock;
import iasumonecara.DelveDeep.blocks.naturalKaoliniteBlock;
import iasumonecara.DelveDeep.blocks.naturalKimberliteBlock;
import iasumonecara.DelveDeep.blocks.naturalLigniteBlock;
import iasumonecara.DelveDeep.blocks.naturalLimestoneBlock;
import iasumonecara.DelveDeep.blocks.naturalLimoniteBlock;
import iasumonecara.DelveDeep.blocks.naturalMagnetiteBlock;
import iasumonecara.DelveDeep.blocks.naturalMalachiteBlock;
import iasumonecara.DelveDeep.blocks.naturalMarbleBlock;
import iasumonecara.DelveDeep.blocks.naturalMarcasiteBlock;
import iasumonecara.DelveDeep.blocks.naturalMicaBlock;
import iasumonecara.DelveDeep.blocks.naturalMicroclineBlock;
import iasumonecara.DelveDeep.blocks.naturalMudstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalNativeAluminumBlock;
import iasumonecara.DelveDeep.blocks.naturalNativeCopperBlock;
import iasumonecara.DelveDeep.blocks.naturalNativeGoldBlock;
import iasumonecara.DelveDeep.blocks.naturalNativePlatinumBlock;
import iasumonecara.DelveDeep.blocks.naturalNativeSilverBlock;
import iasumonecara.DelveDeep.blocks.naturalObsidianBlock;
import iasumonecara.DelveDeep.blocks.naturalOlivineBlock;
import iasumonecara.DelveDeep.blocks.naturalOrpimentBlock;
import iasumonecara.DelveDeep.blocks.naturalOrthoclaseBlock;
import iasumonecara.DelveDeep.blocks.naturalPericlaseBlock;
import iasumonecara.DelveDeep.blocks.naturalPetrifiedWoodBlock;
import iasumonecara.DelveDeep.blocks.naturalPhylliteBlock;
import iasumonecara.DelveDeep.blocks.naturalPitchblendeBlock;
import iasumonecara.DelveDeep.blocks.naturalPuddingstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalPyrolusiteBlock;
import iasumonecara.DelveDeep.blocks.naturalQuartziteBlock;
import iasumonecara.DelveDeep.blocks.naturalRawAdamantineBlock;
import iasumonecara.DelveDeep.blocks.naturalRealgarBlock;
import iasumonecara.DelveDeep.blocks.naturalRedstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalRhyoliteBlock;
import iasumonecara.DelveDeep.blocks.naturalRockSaltBlock;
import iasumonecara.DelveDeep.blocks.naturalRutileBlock;
import iasumonecara.DelveDeep.blocks.naturalSaltpeterBlock;
import iasumonecara.DelveDeep.blocks.naturalSandstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalSatinsparBlock;
import iasumonecara.DelveDeep.blocks.naturalSchistBlock;
import iasumonecara.DelveDeep.blocks.naturalSeleniteBlock;
import iasumonecara.DelveDeep.blocks.naturalSerpentineBlock;
import iasumonecara.DelveDeep.blocks.naturalShaleBlock;
import iasumonecara.DelveDeep.blocks.naturalSiltstoneBlock;
import iasumonecara.DelveDeep.blocks.naturalSlateBlock;
import iasumonecara.DelveDeep.blocks.naturalSphaleriteBlock;
import iasumonecara.DelveDeep.blocks.naturalStibniteBlock;
import iasumonecara.DelveDeep.blocks.naturalSylviteBlock;
import iasumonecara.DelveDeep.blocks.naturalTalcBlock;
import iasumonecara.DelveDeep.blocks.naturalTetrahedriteBlock;
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

@Mod(modid="DelveDeep", name="DelveDeep", version="0.1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)


public class DelveDeep {
	
	@Instance("DelveDeep")
    public static DelveDeep instance;
	private final static Item BasicCircuit = new BasicCircuit(5000);
	private final static Item ElectricMotor = new ElectricMotor(5001);
	private final static Item ConduitBox = new ConduitBox(5002);
	private final static Item Fan = new Fan(5003);
	private final static Item InsulatedCopperWire = new InsulatedCopperWire(5004);
	private final static Item UninsulatedCopperWire = new UninsulatedCopperWire(5005);
	private final static Item Rotor = new Rotor(5006); 
	private final static Item Insulation = new Insulation(5007);
	private final static Item DrivePulley = new DrivePulley(5008);
	
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
        
        ItemStack gravelStack = new ItemStack(Block.gravel);
        ItemStack cobbleStack = new ItemStack(Block.cobblestone);
        ItemStack dirtStack = new ItemStack(Block.dirt);
        ItemStack ingotIronStack = new ItemStack(Item.ingotIron);
     
        GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "xy", "yx",'x', dirtStack, 'y', gravelStack);
           
        LanguageRegistry.addName(ElectricMotor, "Electric Motor");
        LanguageRegistry.addName(BasicCircuit, "Basic Circuit");
        LanguageRegistry.addName(ConduitBox, "Conduit Box");
        LanguageRegistry.addName(DrivePulley, "Drive Pulley");
        LanguageRegistry.addName(Fan,"Fan");
        LanguageRegistry.addName(InsulatedCopperWire,"Insulated Copper Wire");
        LanguageRegistry.addName(Insulation, "Insulation");
        LanguageRegistry.addName(Rotor, "Rotor");
        LanguageRegistry.addName(UninsulatedCopperWire, "Uninsulated Copper Wire");
        
        //Natural Blocks
        naturalAlabaster = new naturalAlabasterBlock(499, "naturalAlabaster").setUnlocalizedName("naturalAlabaster").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalAlabaster, "Natural Alabaster");
        MinecraftForge.setBlockHarvestLevel(naturalAlabaster, "pickaxe", 0);
        GameRegistry.registerBlock(naturalAlabaster, "naturalAlabaster");

        naturalAlunite = new naturalAluniteBlock(500, "naturalAlunite").setUnlocalizedName("naturalAlunite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalAlunite, "Natural Alunite");
        MinecraftForge.setBlockHarvestLevel(naturalAlunite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalAlunite, "naturalAlunite");

        naturalAnhydrite = new naturalAnhydriteBlock(501, "naturalAnhydrite").setUnlocalizedName("naturalAnhydrite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalAnhydrite, "Natural Anhydrite");
        MinecraftForge.setBlockHarvestLevel(naturalAnhydrite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalAnhydrite, "naturalAnhydrite");
        
        naturalBasalt = new naturalBasaltBlock(502, "naturalBasalt").setUnlocalizedName("naturalBasalt").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBasalt, "Natural Basalt");
        MinecraftForge.setBlockHarvestLevel(naturalBasalt, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBasalt, "naturalBasalt");
        
        naturalBauxite = new naturalBauxiteBlock(503, "naturalBauxite").setUnlocalizedName("naturalBauxite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBauxite, "Natural Bauxite");
        MinecraftForge.setBlockHarvestLevel(naturalBauxite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBauxite, "naturalBauxite");

        naturalBismuthinite = new naturalBismuthiniteBlock(504, "naturalBismuthinite").setUnlocalizedName("naturalBismuthinite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBismuthinite, "Natural Bismuthinite");
        MinecraftForge.setBlockHarvestLevel(naturalBismuthinite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBismuthinite, "naturalBismuthinite");

        naturalBitumousCoal = new naturalBitumousCoalBlock(505, "naturalBitumousCoal").setUnlocalizedName("naturalBitumousCoal").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBitumousCoal, "Natural Bitumous Coal");
        MinecraftForge.setBlockHarvestLevel(naturalBitumousCoal, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBitumousCoal, "naturalBitumousCoal");

        naturalBorax = new naturalBoraxBlock(506, "naturalBorax").setUnlocalizedName("naturalBorax").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBorax, "Natural Borax");
        MinecraftForge.setBlockHarvestLevel(naturalBorax, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBorax, "naturalBorax");

        naturalBrimstone = new naturalBrimstoneBlock(507, "naturalBrimstone").setUnlocalizedName("naturalBrimstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalBrimstone, "Natural Brimstone");
        MinecraftForge.setBlockHarvestLevel(naturalBrimstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalBrimstone, "naturalBrimstone");

        naturalCalcite = new naturalCalciteBlock(508, "naturalCalcite").setUnlocalizedName("naturalCalcite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalCalcite, "Natural Calcite");
        MinecraftForge.setBlockHarvestLevel(naturalCalcite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalCalcite, "naturalCalcite");

        naturalCassiterite = new naturalCassiteriteBlock(509, "naturalCassiterite").setUnlocalizedName("naturalCassiterite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalCassiterite, "Natural Cassiterite");
        MinecraftForge.setBlockHarvestLevel(naturalCassiterite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalCassiterite, "naturalCassiterite");

        naturalChalk = new naturalChalkBlock(510, "naturalChalk").setUnlocalizedName("naturalChalk").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalChalk, "Natural Chalk");
        MinecraftForge.setBlockHarvestLevel(naturalChalk, "pickaxe", 0);
        GameRegistry.registerBlock(naturalChalk, "naturalChalk");

        naturalChert = new naturalChertBlock(511, "naturalChert").setUnlocalizedName("naturalChert").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalChert, "Natural Chert");
        MinecraftForge.setBlockHarvestLevel(naturalChert, "pickaxe", 0);
        GameRegistry.registerBlock(naturalChert, "naturalChert");

        naturalChromite = new naturalChromiteBlock(512, "naturalChromite").setUnlocalizedName("naturalChromite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalChromite, "Natural Chromite");
        MinecraftForge.setBlockHarvestLevel(naturalChromite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalChromite, "naturalChromite");

        naturalCinnabar = new naturalCinnabarBlock(513, "naturalCinnabar").setUnlocalizedName("naturalCinnabar").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalCinnabar, "Natural Cinnabar");
        MinecraftForge.setBlockHarvestLevel(naturalCinnabar, "pickaxe", 0);
        GameRegistry.registerBlock(naturalCinnabar, "naturalCinnabar");

        naturalClaystone = new naturalClaystoneBlock(514, "naturalClaystone").setUnlocalizedName("naturalClaystone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalClaystone, "Natural Claystone");
        MinecraftForge.setBlockHarvestLevel(naturalClaystone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalClaystone, "naturalClaystone");

        naturalCobaltite = new naturalCobaltiteBlock(515, "naturalCobaltite").setUnlocalizedName("naturalCobaltite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalCobaltite, "Natural Cobaltite");
        MinecraftForge.setBlockHarvestLevel(naturalCobaltite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalCobaltite, "naturalCobaltite");

        naturalConglomerate = new naturalConglomerateBlock(516, "naturalConglomerate").setUnlocalizedName("naturalConglomerate").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalConglomerate, "Natural Conglomerate");
        MinecraftForge.setBlockHarvestLevel(naturalConglomerate, "pickaxe", 0);
        GameRegistry.registerBlock(naturalConglomerate, "naturalConglomerate");

        naturalCryolite = new naturalCryoliteBlock(517, "naturalCryolite").setUnlocalizedName("naturalCryolite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalCryolite, "Natural Cryolite");
        MinecraftForge.setBlockHarvestLevel(naturalCryolite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalCryolite, "naturalCryolite");

        naturalDacite = new naturalDaciteBlock(518, "naturalDacite").setUnlocalizedName("naturalDacite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalDacite, "Natural Dacite");
        MinecraftForge.setBlockHarvestLevel(naturalDacite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalDacite, "naturalDacite");

        naturalDiorite = new naturalDioriteBlock(519, "naturalDiorite").setUnlocalizedName("naturalDiorite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalDiorite, "Natural Diorite");
        MinecraftForge.setBlockHarvestLevel(naturalDiorite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalDiorite, "naturalDiorite");

        naturalGabbro = new naturalGabbroBlock(520, "naturalGabbro").setUnlocalizedName("naturalGabbro").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGabbro, "Natural Gabbro");
        MinecraftForge.setBlockHarvestLevel(naturalGabbro, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGabbro, "naturalGabbro");

        naturalGalena = new naturalGalenaBlock(521, "naturalGalena").setUnlocalizedName("naturalGalena").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGalena, "Natural Galena");
        MinecraftForge.setBlockHarvestLevel(naturalGalena, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGalena, "naturalGalena");

        naturalGarnierite = new naturalGarnieriteBlock(522, "naturalGarnierite").setUnlocalizedName("naturalGarnierite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGarnierite, "Natural Garnierite");
        MinecraftForge.setBlockHarvestLevel(naturalGarnierite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGarnierite, "naturalGarnierite");

        naturalGranite = new naturalGraniteBlock(523, "naturalGranite").setUnlocalizedName("naturalGranite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGranite, "Natural Granite");
        MinecraftForge.setBlockHarvestLevel(naturalGranite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGranite, "naturalGranite");

        naturalGraphite = new naturalGraphiteBlock(524, "naturalGraphite").setUnlocalizedName("naturalGraphite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGraphite, "Natural Graphite");
        MinecraftForge.setBlockHarvestLevel(naturalGraphite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGraphite, "naturalGraphite");

        naturalGypsum = new naturalGypsumBlock(525, "naturalGypsum").setUnlocalizedName("naturalGypsum").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalGypsum, "Natural Gypsum");
        MinecraftForge.setBlockHarvestLevel(naturalGypsum, "pickaxe", 0);
        GameRegistry.registerBlock(naturalGypsum, "naturalGypsum");

        naturalHematite = new naturalHematiteBlock(526, "naturalHematite").setUnlocalizedName("naturalHematite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalHematite, "Natural Hematite");
        MinecraftForge.setBlockHarvestLevel(naturalHematite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalHematite, "naturalHematite");

        naturalHornblende = new naturalHornblendeBlock(527, "naturalHornblende").setUnlocalizedName("naturalHornblende").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalHornblende, "Natural Hornblende");
        MinecraftForge.setBlockHarvestLevel(naturalHornblende, "pickaxe", 0);
        GameRegistry.registerBlock(naturalHornblende, "naturalHornblende");

        naturalHornSilver = new naturalHornSilverBlock(528, "naturalHornSilver").setUnlocalizedName("naturalHornSilver").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalHornSilver, "Natural Horn Silver");
        MinecraftForge.setBlockHarvestLevel(naturalHornSilver, "pickaxe", 0);
        GameRegistry.registerBlock(naturalHornSilver, "naturalHornSilver");

        naturalIlmenite = new naturalIlmeniteBlock(529, "naturalIlmenite").setUnlocalizedName("naturalIlmenite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalIlmenite, "Natural Ilmenite");
        MinecraftForge.setBlockHarvestLevel(naturalIlmenite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalIlmenite, "naturalIlmenite");

        naturalJet = new naturalJetBlock(530, "naturalJet").setUnlocalizedName("naturalJet").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalJet, "Natural Jet");
        MinecraftForge.setBlockHarvestLevel(naturalJet, "pickaxe", 0);
        GameRegistry.registerBlock(naturalJet, "naturalJet");

        naturalKaolinite = new naturalKaoliniteBlock(531, "naturalKaolinite").setUnlocalizedName("naturalKaolinite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalKaolinite, "Natural Kaolinite");
        MinecraftForge.setBlockHarvestLevel(naturalKaolinite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalKaolinite, "naturalKaolinite");

        naturalKimberlite = new naturalKimberliteBlock(532, "naturalKimberlite").setUnlocalizedName("naturalKimberlite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalKimberlite, "Natural Kimberlite");
        MinecraftForge.setBlockHarvestLevel(naturalKimberlite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalKimberlite, "naturalKimberlite");

        naturalLignite = new naturalLigniteBlock(533, "naturalLignite").setUnlocalizedName("naturalLignite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalLignite, "Natural Lignite");
        MinecraftForge.setBlockHarvestLevel(naturalLignite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalLignite, "naturalLignite");

        naturalLimestone = new naturalLimestoneBlock(534, "naturalLimestone").setUnlocalizedName("naturalLimestone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalLimestone, "Natural Limestone");
        MinecraftForge.setBlockHarvestLevel(naturalLimestone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalLimestone, "naturalLimestone");

        naturalLimonite = new naturalLimoniteBlock(535, "naturalLimonite").setUnlocalizedName("naturalLimonite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalLimonite, "Natural Limonite");
        MinecraftForge.setBlockHarvestLevel(naturalLimonite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalLimonite, "naturalLimonite");

        naturalMagnetite = new naturalMagnetiteBlock(536, "naturalMagnetite").setUnlocalizedName("naturalMagnetite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMagnetite, "Natural Magnetite");
        MinecraftForge.setBlockHarvestLevel(naturalMagnetite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMagnetite, "naturalMagnetite");

        naturalMalachite = new naturalMalachiteBlock(537, "naturalMalachite").setUnlocalizedName("naturalMalachite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMalachite, "Natural Malachite");
        MinecraftForge.setBlockHarvestLevel(naturalMalachite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMalachite, "naturalMalachite");

        naturalMarble = new naturalMarbleBlock(538, "naturalMarble").setUnlocalizedName("naturalMarble").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMarble, "Natural Marble");
        MinecraftForge.setBlockHarvestLevel(naturalMarble, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMarble, "naturalMarble");

        naturalMarcasite = new naturalMarcasiteBlock(539, "naturalMarcasite").setUnlocalizedName("naturalMarcasite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMarcasite, "Natural Marcasite");
        MinecraftForge.setBlockHarvestLevel(naturalMarcasite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMarcasite, "naturalMarcasite");

        naturalMica = new naturalMicaBlock(540, "naturalMica").setUnlocalizedName("naturalMica").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMica, "Natural Mica");
        MinecraftForge.setBlockHarvestLevel(naturalMica, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMica, "naturalMica");

        naturalMicrocline = new naturalMicroclineBlock(541, "naturalMicrocline").setUnlocalizedName("naturalMicrocline").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMicrocline, "Natural Microcline");
        MinecraftForge.setBlockHarvestLevel(naturalMicrocline, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMicrocline, "naturalMicrocline");

        naturalMudstone = new naturalMudstoneBlock(542, "naturalMudstone").setUnlocalizedName("naturalMudstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalMudstone, "Natural Mudstone");
        MinecraftForge.setBlockHarvestLevel(naturalMudstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalMudstone, "naturalMudstone");

        naturalNativeAluminum = new naturalNativeAluminumBlock(543, "naturalNativeAluminum").setUnlocalizedName("naturalNativeAluminum").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalNativeAluminum, "Natural Native Aluminum");
        MinecraftForge.setBlockHarvestLevel(naturalNativeAluminum, "pickaxe", 0);
        GameRegistry.registerBlock(naturalNativeAluminum, "naturalNativeAluminum");

        naturalNativeCopper = new naturalNativeCopperBlock(544, "naturalNativeCopper").setUnlocalizedName("naturalNativeCopper").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalNativeCopper, "Natural Native Copper");
        MinecraftForge.setBlockHarvestLevel(naturalNativeCopper, "pickaxe", 0);
        GameRegistry.registerBlock(naturalNativeCopper, "naturalNativeCopper");

        naturalNativeGold = new naturalNativeGoldBlock(545, "naturalNativeGold").setUnlocalizedName("naturalNativeGold").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalNativeGold, "Natural Native Gold");
        MinecraftForge.setBlockHarvestLevel(naturalNativeGold, "pickaxe", 0);
        GameRegistry.registerBlock(naturalNativeGold, "naturalNativeGold");

        naturalNativePlatinum = new naturalNativePlatinumBlock(546, "naturalNativePlatinum").setUnlocalizedName("naturalNativePlatinum").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalNativePlatinum, "Natural Native Platinum");
        MinecraftForge.setBlockHarvestLevel(naturalNativePlatinum, "pickaxe", 0);
        GameRegistry.registerBlock(naturalNativePlatinum, "naturalNativePlatinum");

        naturalNativeSilver = new naturalNativeSilverBlock(547, "naturalNativeSilver").setUnlocalizedName("naturalNativeSilver").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalNativeSilver, "Natural Native Silver");
        MinecraftForge.setBlockHarvestLevel(naturalNativeSilver, "pickaxe", 0);
        GameRegistry.registerBlock(naturalNativeSilver, "naturalNativeSilver");

        naturalObsidian = new naturalObsidianBlock(548, "naturalObsidian").setUnlocalizedName("naturalObsidian").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalObsidian, "Natural Obsidian");
        MinecraftForge.setBlockHarvestLevel(naturalObsidian, "pickaxe", 0);
        GameRegistry.registerBlock(naturalObsidian, "naturalObsidian");

        naturalOlivine = new naturalOlivineBlock(549, "naturalOlivine").setUnlocalizedName("naturalOlivine").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalOlivine, "Natural Olivine");
        MinecraftForge.setBlockHarvestLevel(naturalOlivine, "pickaxe", 0);
        GameRegistry.registerBlock(naturalOlivine, "naturalOlivine");

        naturalOrpiment = new naturalOrpimentBlock(550, "naturalOrpiment").setUnlocalizedName("naturalOrpiment").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalOrpiment, "Natural Orpiment");
        MinecraftForge.setBlockHarvestLevel(naturalOrpiment, "pickaxe", 0);
        GameRegistry.registerBlock(naturalOrpiment, "naturalOrpiment");

        naturalOrthoclase = new naturalOrthoclaseBlock(551, "naturalOrthoclase").setUnlocalizedName("naturalOrthoclase").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalOrthoclase, "Natural Orthoclase");
        MinecraftForge.setBlockHarvestLevel(naturalOrthoclase, "pickaxe", 0);
        GameRegistry.registerBlock(naturalOrthoclase, "naturalOrthoclase");

        naturalPericlase = new naturalPericlaseBlock(552, "naturalPericlase").setUnlocalizedName("naturalPericlase").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPericlase, "Natural Periclase");
        MinecraftForge.setBlockHarvestLevel(naturalPericlase, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPericlase, "naturalPericlase");

        naturalPetrifiedWood = new naturalPetrifiedWoodBlock(553, "naturalPetrifiedWood").setUnlocalizedName("naturalPetrifiedWood").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPetrifiedWood, "Natural Petrified Wood");
        MinecraftForge.setBlockHarvestLevel(naturalPetrifiedWood, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPetrifiedWood, "naturalPetrifiedWood");

        naturalPhyllite = new naturalPhylliteBlock(554, "naturalPhyllite").setUnlocalizedName("naturalPhyllite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPhyllite, "Natural Phyllite");
        MinecraftForge.setBlockHarvestLevel(naturalPhyllite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPhyllite, "naturalPhyllite");

        naturalPitchblende = new naturalPitchblendeBlock(555, "naturalPitchblende").setUnlocalizedName("naturalPitchblende").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPitchblende, "Natural Pitchblende");
        MinecraftForge.setBlockHarvestLevel(naturalPitchblende, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPitchblende, "naturalPitchblende");

        naturalPuddingstone = new naturalPuddingstoneBlock(556, "naturalPuddingstone").setUnlocalizedName("naturalPuddingstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPuddingstone, "Natural Puddingstone");
        MinecraftForge.setBlockHarvestLevel(naturalPuddingstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPuddingstone, "naturalPuddingstone");

        naturalPyrolusite = new naturalPyrolusiteBlock(557, "naturalPyrolusite").setUnlocalizedName("naturalPyrolusite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalPyrolusite, "Natural Pyrolusite");
        MinecraftForge.setBlockHarvestLevel(naturalPyrolusite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalPyrolusite, "naturalPyrolusite");

        naturalQuartzite = new naturalQuartziteBlock(558, "naturalQuartzite").setUnlocalizedName("naturalQuartzite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalQuartzite, "Natural Quartzite");
        MinecraftForge.setBlockHarvestLevel(naturalQuartzite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalQuartzite, "naturalQuartzite");

        naturalRawAdamantine = new naturalRawAdamantineBlock(559, "naturalRawAdamantine").setUnlocalizedName("naturalRawAdamantine").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRawAdamantine, "Natural Raw Adamantine");
        MinecraftForge.setBlockHarvestLevel(naturalRawAdamantine, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRawAdamantine, "naturalRawAdamantine");

        naturalRealgar = new naturalRealgarBlock(560, "naturalRealgar").setUnlocalizedName("naturalRealgar").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRealgar, "Natural Realgar");
        MinecraftForge.setBlockHarvestLevel(naturalRealgar, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRealgar, "naturalRealgar");

        naturalRedstone = new naturalRedstoneBlock(561, "naturalRedstone").setUnlocalizedName("naturalRedstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRedstone, "Natural Redstone");
        MinecraftForge.setBlockHarvestLevel(naturalRedstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRedstone, "naturalRedstone");

        naturalRhyolite = new naturalRhyoliteBlock(562, "naturalRhyolite").setUnlocalizedName("naturalRhyolite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRhyolite, "Natural Rhyolite");
        MinecraftForge.setBlockHarvestLevel(naturalRhyolite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRhyolite, "naturalRhyolite");

        naturalRockSalt = new naturalRockSaltBlock(563, "naturalRockSalt").setUnlocalizedName("naturalRockSalt").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRockSalt, "Natural Rock Salt");
        MinecraftForge.setBlockHarvestLevel(naturalRockSalt, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRockSalt, "naturalRockSalt");

        naturalRutile = new naturalRutileBlock(564, "naturalRutile").setUnlocalizedName("naturalRutile").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalRutile, "Natural Rutile");
        MinecraftForge.setBlockHarvestLevel(naturalRutile, "pickaxe", 0);
        GameRegistry.registerBlock(naturalRutile, "naturalRutile");

        naturalSaltpeter = new naturalSaltpeterBlock(565, "naturalSaltpeter").setUnlocalizedName("naturalSaltpeter").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSaltpeter, "Natural Saltpeter");
        MinecraftForge.setBlockHarvestLevel(naturalSaltpeter, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSaltpeter, "naturalSaltpeter");

        naturalSandstone = new naturalSandstoneBlock(566, "naturalSandstone").setUnlocalizedName("naturalSandstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSandstone, "Natural Sandstone");
        MinecraftForge.setBlockHarvestLevel(naturalSandstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSandstone, "naturalSandstone");

        naturalSatinspar = new naturalSatinsparBlock(567, "naturalSatinspar").setUnlocalizedName("naturalSatinspar").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSatinspar, "Natural Satinspar");
        MinecraftForge.setBlockHarvestLevel(naturalSatinspar, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSatinspar, "naturalSatinspar");

        naturalSchist = new naturalSchistBlock(568, "naturalSchist").setUnlocalizedName("naturalSchist").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSchist, "Natural Schist");
        MinecraftForge.setBlockHarvestLevel(naturalSchist, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSchist, "naturalSchist");

        naturalSelenite = new naturalSeleniteBlock(569, "naturalSelenite").setUnlocalizedName("naturalSelenite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSelenite, "Natural Selenite");
        MinecraftForge.setBlockHarvestLevel(naturalSelenite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSelenite, "naturalSelenite");

        naturalSerpentine = new naturalSerpentineBlock(570, "naturalSerpentine").setUnlocalizedName("naturalSerpentine").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSerpentine, "Natural Serpentine");
        MinecraftForge.setBlockHarvestLevel(naturalSerpentine, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSerpentine, "naturalSerpentine");

        naturalShale = new naturalShaleBlock(571, "naturalShale").setUnlocalizedName("naturalShale").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalShale, "Natural Shale");
        MinecraftForge.setBlockHarvestLevel(naturalShale, "pickaxe", 0);
        GameRegistry.registerBlock(naturalShale, "naturalShale");

        naturalSiltstone = new naturalSiltstoneBlock(572, "naturalSiltstone").setUnlocalizedName("naturalSiltstone").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSiltstone, "Natural Siltstone");
        MinecraftForge.setBlockHarvestLevel(naturalSiltstone, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSiltstone, "naturalSiltstone");

        naturalSlate = new naturalSlateBlock(573, "naturalSlate").setUnlocalizedName("naturalSlate").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSlate, "Natural Slate");
        MinecraftForge.setBlockHarvestLevel(naturalSlate, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSlate, "naturalSlate");

        naturalSphalerite = new naturalSphaleriteBlock(574, "naturalSphalerite").setUnlocalizedName("naturalSphalerite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSphalerite, "Natural Sphalerite");
        MinecraftForge.setBlockHarvestLevel(naturalSphalerite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSphalerite, "naturalSphalerite");

        naturalStibnite = new naturalStibniteBlock(575, "naturalStibnite").setUnlocalizedName("naturalStibnite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalStibnite, "Natural Stibnite");
        MinecraftForge.setBlockHarvestLevel(naturalStibnite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalStibnite, "naturalStibnite");

        naturalSylvite = new naturalSylviteBlock(576, "naturalSylvite").setUnlocalizedName("naturalSylvite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalSylvite, "Natural Sylvite");
        MinecraftForge.setBlockHarvestLevel(naturalSylvite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalSylvite, "naturalSylvite");

        naturalTalc = new naturalTalcBlock(577, "naturalTalc").setUnlocalizedName("naturalTalc").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalTalc, "Natural Talc");
        MinecraftForge.setBlockHarvestLevel(naturalTalc, "pickaxe", 0);
        GameRegistry.registerBlock(naturalTalc, "naturalTalc");

        naturalTetrahedrite = new naturalTetrahedriteBlock(578, "naturalTetrahedrite").setUnlocalizedName("naturalTetrahedrite").setHardness(3.0F).setResistance(10.0F);
        LanguageRegistry.addName(naturalTetrahedrite, "Natural Tetrahedrite");
        MinecraftForge.setBlockHarvestLevel(naturalTetrahedrite, "pickaxe", 0);
        GameRegistry.registerBlock(naturalTetrahedrite, "naturalTetrahedrite");
        //Smooth Blocks
        //Carved Blocks
        //Brick Blocks
        
    }
 
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}