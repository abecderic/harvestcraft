package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegistry 
{
	public static Block AridGardenBlock;
	public static Block FrostGardenBlock;
	public static Block TropicalGardenBlock;
	public static Block WindyGardenBlock;
	public static Block ShadedGardenBlock;
	public static Block SoggyGardenBlock;
	
	public static Block[] PamTemperateSaplings;
	public static Block[] PamWarmSaplings;
	public static Block[] PamLogSaplings;
	
	public static Block pamblackberryCrop;
	public static Block pamblueberryCrop;
	public static Block pamcandleberryCrop;
	public static Block pamraspberryCrop;
	public static Block pamstrawberryCrop;
	public static Block pamcactusfruitCrop;
	public static Block pamasparagusCrop;
	public static Block pambarleyCrop;
	public static Block pamoatsCrop;
	public static Block pamryeCrop;
	public static Block pamcornCrop;
	public static Block pambambooshootCrop;
	public static Block pamcantaloupeCrop;
	public static Block pamcucumberCrop;
	public static Block pamwintersquashCrop;
	public static Block pamzucchiniCrop;
	public static Block pambeetCrop;
	public static Block pamonionCrop;
	public static Block pamparsnipCrop;
	public static Block pampeanutCrop;
	public static Block pamradishCrop;
	public static Block pamrutabagaCrop;
	public static Block pamsweetpotatoCrop;
	public static Block pamturnipCrop;
	public static Block pamrhubarbCrop;
	public static Block pamceleryCrop;
	public static Block pamgarlicCrop;
	public static Block pamgingerCrop;
	public static Block pamspiceleafCrop;
	public static Block pamtealeafCrop;
	public static Block pamcoffeebeanCrop;
	public static Block pammustardseedsCrop;
	public static Block pambroccoliCrop;
	public static Block pamcauliflowerCrop;
	public static Block pamleekCrop;
	public static Block pamlettuceCrop;
	public static Block pamscallionCrop;
	public static Block pamartichokeCrop;
	public static Block pambrusselsproutCrop;
	public static Block pamcabbageCrop;
	public static Block pamspinachCrop;
	public static Block pamwhitemushroomCrop;
	public static Block pambeanCrop;
	public static Block pamsoybeanCrop;
	public static Block pambellpepperCrop;
	public static Block pamchilipepperCrop;
	public static Block pameggplantCrop;
	public static Block pamokraCrop;
	public static Block pampeasCrop;
	public static Block pamtomatoCrop;
	public static Block pamcottonCrop;
	public static Block pampineappleCrop;
	public static Block pamgrapeCrop;
	public static Block pamkiwiCrop;
	public static Block pamcranberryCrop;
	public static Block pamriceCrop;
	public static Block pamseaweedCrop;
	public static Block pamcurryleafCrop;
	public static Block pamsesameseedsCrop;
	public static Block pamwaterchestnutCrop;
	
	public static Block pamApple;
	public static Block pamappleSapling;
	public static Block pamAlmond;
	public static Block pamalmondSapling;
	public static Block pamApricot;
	public static Block pamapricotSapling;
	public static Block pamAvocado;
	public static Block pamavocadoSapling;
	public static Block pamBanana;
	public static Block pambananaSapling;
	public static Block pamCashew;
	public static Block pamcashewSapling;
	public static Block pamCherry;
	public static Block pamcherrySapling;
	public static Block pamChestnut;
	public static Block pamchestnutSapling;
	public static Block pamCinnamon;
	public static Block pamcinnamonSapling;
	public static Block pamCoconut;
	public static Block pamcoconutSapling;
	public static Block pamDate;
	public static Block pamdateSapling;
	public static Block pamDragonfruit;
	public static Block pamdragonfruitSapling;
	public static Block pamDurian;
	public static Block pamdurianSapling;
	public static Block pamFig;
	public static Block pamfigSapling;
	public static Block pamGooseberry;
	public static Block pamgooseberrySapling;
	public static Block pamGrapefruit;
	public static Block pamgrapefruitSapling;
	public static Block pamLemon;
	public static Block pamlemonSapling;
	public static Block pamLime;
	public static Block pamlimeSapling;
	public static Block pamMaple;
	public static Block pammapleSapling;
	public static Block pamMango;
	public static Block pammangoSapling;
	public static Block pamNutmeg;
	public static Block pamnutmegSapling;
	public static Block pamOlive;
	public static Block pamoliveSapling;
	public static Block pamOrange;
	public static Block pamorangeSapling;
	public static Block pamPapaya;
	public static Block pampapayaSapling;
	public static Block pamPaperbark;
	public static Block pampaperbarkSapling;
	public static Block pamPeach;
	public static Block pampeachSapling;
	public static Block pamPear;
	public static Block pampearSapling;
	public static Block pamPecan;
	public static Block pampecanSapling;
	public static Block pamPeppercorn;
	public static Block pampeppercornSapling;
	public static Block pamPersimmon;
	public static Block pampersimmonSapling;
	public static Block pamPistachio;
	public static Block pampistachioSapling;
	public static Block pamPlum;
	public static Block pamplumSapling;
	public static Block pamPomegranate;
	public static Block pampomegranateSapling;
	public static Block pamStarfruit;
	public static Block pamstarfruitSapling;
	public static Block pamVanillabean;
	public static Block pamvanillabeanSapling;
	public static Block pamWalnut;
	public static Block pamwalnutSapling;
	
	public static int gardenRarity;
	public static int gardendropAmount;
	public static boolean enablegardenSpread;
	public static int gardenspreadRate;
	public static boolean enablearidgardenGeneration;
	public static boolean enablefrostgardenGeneration;
	public static boolean enabletropicalgardenGeneration;
	public static boolean enablewindygardenGeneration;
	public static boolean enableshadedgardenGeneration;
	public static boolean enablesoggygardenGeneration;
	public static int temperatefruittreeRarity;
	public static int tropicalfruittreeRarity;
	public static int coniferousfruittreeRarity;
	public static boolean appletreeGeneration;
	public static boolean almondtreeGeneration;
	public static boolean apricottreeGeneration;
	public static boolean avocadotreeGeneration;
	public static boolean bananatreeGeneration;
	public static boolean cashewtreeGeneration;
	public static boolean cherrytreeGeneration;
	public static boolean chestnuttreeGeneration;
	public static boolean cinnamontreeGeneration;
	public static boolean coconuttreeGeneration;
	public static boolean datetreeGeneration;
	public static boolean dragonfruittreeGeneration;
	public static boolean duriantreeGeneration;
	public static boolean figtreeGeneration;
	public static boolean grapefruittreeGeneration;
	public static boolean lemontreeGeneration;
	public static boolean limetreeGeneration;
	public static boolean mapletreeGeneration;
	public static boolean mangotreeGeneration;
	public static boolean nutmegtreeGeneration;
	public static boolean olivetreeGeneration;
	public static boolean orangetreeGeneration;
	public static boolean papayatreeGeneration;
	public static boolean paperbarktreeGeneration;
	public static boolean peachtreeGeneration;
	public static boolean peartreeGeneration;
	public static boolean pecantreeGeneration;
	public static boolean peppercorntreeGeneration;
	public static boolean persimmontreeGeneration;
	public static boolean pistachiotreeGeneration;
	public static boolean plumtreeGeneration;
	public static boolean pomegranatetreeGeneration;
	public static boolean starfruittreeGeneration;
	public static boolean vanillabeantreeGeneration;
	public static boolean walnuttreeGeneration;
	public static boolean gooseberrytreeGeneration;
	//public static boolean cropsdropSeeds;
	public static boolean rightclickharvestCrop;
	public static boolean rightclickharvestFruit;
	//public static boolean gardensdropSeeds;
	public static boolean enablecropspecialplanting;
	
	public static void initBlocks(FMLPreInitializationEvent event, Configuration config)
	/*     */   {
	/* 358 */     gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
	/* 359 */     gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
	/* 360 */     enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
	/* 361 */     gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
	enablearidgardenGeneration = config.get("gardens", "enablearidgardenGeneration", true).getBoolean(true);
	enablefrostgardenGeneration = config.get("gardens", "enablefrostgardenGeneration", true).getBoolean(true);
	enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
	enablewindygardenGeneration = config.get("gardens", "enablewindygardenGeneration", true).getBoolean(true);
	enableshadedgardenGeneration = config.get("gardens", "enableshadedgardenGeneration", true).getBoolean(true);
	/* 372 */     enablesoggygardenGeneration = config.get("gardens", "enablesoggygardenGeneration", true).getBoolean(true);
	/* 374 */     temperatefruittreeRarity = config.get("fruit trees", "temperatefruittreeRarity", 24).getInt();
	/* 375 */     tropicalfruittreeRarity = config.get("fruit trees", "tropicalfruittreeRarity", 32).getInt();
	/* 376 */     coniferousfruittreeRarity = config.get("fruit trees", "coniferousfruittreeRarity", 24).getInt();
	/* 377 */     appletreeGeneration = config.get("fruit trees", "appletreeGeneration", true).getBoolean(true);
	/* 378 */     almondtreeGeneration = config.get("fruit trees", "almondtreeGeneration", true).getBoolean(true);
	/* 379 */     apricottreeGeneration = config.get("fruit trees", "apricottreeGeneration", true).getBoolean(true);
	/* 380 */     avocadotreeGeneration = config.get("fruit trees", "avocadotreeGeneration", true).getBoolean(true);
	/* 381 */     bananatreeGeneration = config.get("fruit trees", "bananatreeGeneration", true).getBoolean(true);
	/* 382 */     cashewtreeGeneration = config.get("fruit trees", "cashewtreeGeneration", true).getBoolean(true);
	/* 383 */     cherrytreeGeneration = config.get("fruit trees", "cherrytreeGeneration", true).getBoolean(true);
	/* 384 */     chestnuttreeGeneration = config.get("fruit trees", "chestnuttreeGeneration", true).getBoolean(true);
	/* 385 */     cinnamontreeGeneration = config.get("fruit trees", "cinnamontreeGeneration", true).getBoolean(true);
	/* 386 */     coconuttreeGeneration = config.get("fruit trees", "coconuttreeGeneration", true).getBoolean(true);
	/* 387 */     datetreeGeneration = config.get("fruit trees", "datetreeGeneration", true).getBoolean(true);
	/* 388 */     dragonfruittreeGeneration = config.get("fruit trees", "dragonfruittreeGeneration", true).getBoolean(true);
	/* 389 */     duriantreeGeneration = config.get("fruit trees", "duriantreeGeneration", true).getBoolean(true);
	/* 390 */     figtreeGeneration = config.get("fruit trees", "figtreeGeneration", true).getBoolean(true);
	/* 391 */     grapefruittreeGeneration = config.get("fruit trees", "grapefruittreeGeneration", true).getBoolean(true);
	/* 392 */     lemontreeGeneration = config.get("fruit trees", "lemontreeGeneration", true).getBoolean(true);
	/* 393 */     limetreeGeneration = config.get("fruit trees", "limetreeGeneration", true).getBoolean(true);
	/* 394 */     mapletreeGeneration = config.get("fruit trees", "mapletreeGeneration", true).getBoolean(true);
	/* 395 */     mangotreeGeneration = config.get("fruit trees", "mangotreeGeneration", true).getBoolean(true);
	/* 396 */     nutmegtreeGeneration = config.get("fruit trees", "nutmegtreeGeneration", true).getBoolean(true);
	/* 397 */     olivetreeGeneration = config.get("fruit trees", "olivetreeGeneration", true).getBoolean(true);
	/* 398 */     orangetreeGeneration = config.get("fruit trees", "orangetreeGeneration", true).getBoolean(true);
	/* 399 */     papayatreeGeneration = config.get("fruit trees", "papayatreeGeneration", true).getBoolean(true);
	/* 400 */     paperbarktreeGeneration = config.get("fruit trees", "paperbarktreeGeneration", true).getBoolean(true);
	/* 401 */     peachtreeGeneration = config.get("fruit trees", "peachtreeGeneration", true).getBoolean(true);
	/* 402 */     peartreeGeneration = config.get("fruit trees", "peartreeGeneration", true).getBoolean(true);
	/* 403 */     pecantreeGeneration = config.get("fruit trees", "pecantreeGeneration", true).getBoolean(true);
	/* 404 */     peppercorntreeGeneration = config.get("fruit trees", "peppercorntreeGeneration", true).getBoolean(true);
	/* 405 */     persimmontreeGeneration = config.get("fruit trees", "persimmontreeGeneration", true).getBoolean(true);
	/* 406 */     pistachiotreeGeneration = config.get("fruit trees", "pistachiotreeGeneration", true).getBoolean(true);
	/* 407 */     plumtreeGeneration = config.get("fruit trees", "plumtreeGeneration", true).getBoolean(true);
	/* 408 */     pomegranatetreeGeneration = config.get("fruit trees", "pomegranatetreeGeneration", true).getBoolean(true);
	/* 409 */     starfruittreeGeneration = config.get("fruit trees", "starfruittreeGeneration", true).getBoolean(true);
	/* 410 */     vanillabeantreeGeneration = config.get("fruit trees", "vanillabeantreeGeneration", true).getBoolean(true);
	/* 411 */     walnuttreeGeneration = config.get("fruit trees", "walnuttreeGeneration", true).getBoolean(true);
	/* 412 */     gooseberrytreeGeneration = config.get("fruit trees", "gooseberrytreeGeneration", true).getBoolean(true);
	/*     */     
	/* 414 */     //cropsdropSeeds = config.get("crops", "cropsdropSeeds", false).getBoolean(false);
				  rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
	/* 418 */     rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
	/* 419 */     //gardensdropSeeds = config.get("gardens", "gardensdropSeeds", false).getBoolean(false);
	/* 420 */     enablecropspecialplanting = config.get("crops", "enablecropspecialplanting", true).getBoolean(true);
}
	private static Block registerBlock(String name, Class<? extends ItemBlock> itemblock, Block block)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, itemblock, name);

		return block;
	}

	public static void loadBlockRegistry()
	{
		AridGardenBlock = new AridGardenBlock();
		FrostGardenBlock = new FrostGardenBlock();
		TropicalGardenBlock = new TropicalGardenBlock();
		WindyGardenBlock = new WindyGardenBlock();
		ShadedGardenBlock = new ShadedGardenBlock();
		SoggyGardenBlock = new SoggyGardenBlock();
		
		pamblackberryCrop = registerBlock("pamblackberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamblueberryCrop = registerBlock("pamblueberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcandleberryCrop = registerBlock("pamcandleberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamraspberryCrop = registerBlock("pamraspberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamstrawberryCrop = registerBlock("pamstrawberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcactusfruitCrop = registerBlock("pamcactusfruitCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamasparagusCrop = registerBlock("pamasparagusCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambarleyCrop = registerBlock("pambarleyCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamoatsCrop = registerBlock("pamoatsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamryeCrop = registerBlock("pamryeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcornCrop = registerBlock("pamcornCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambambooshootCrop = registerBlock("pambambooshootCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcantaloupeCrop = registerBlock("pamcantaloupeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcucumberCrop = registerBlock("pamcucumberCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwintersquashCrop = registerBlock("pamwintersquashCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamzucchiniCrop = registerBlock("pamzucchiniCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambeetCrop = registerBlock("pambeetCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamonionCrop = registerBlock("pamonionCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamparsnipCrop = registerBlock("pamparsnipCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampeanutCrop = registerBlock("pampeanutCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamradishCrop = registerBlock("pamradishCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamrutabagaCrop = registerBlock("pamrutabagaCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsweetpotatoCrop = registerBlock("pamsweetpotatoCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamturnipCrop = registerBlock("pamturnipCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamrhubarbCrop = registerBlock("pamrhubarbCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamceleryCrop = registerBlock("pamceleryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgarlicCrop = registerBlock("pamgarlicCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgingerCrop = registerBlock("pamgingerCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamspiceleafCrop = registerBlock("pamspiceleafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamtealeafCrop = registerBlock("pamtealeafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcoffeebeanCrop = registerBlock("pamcoffeebeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pammustardseedsCrop = registerBlock("pammustardseedsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambroccoliCrop = registerBlock("pambroccoliCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcauliflowerCrop = registerBlock("pamcauliflowerCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamleekCrop = registerBlock("pamleekCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamlettuceCrop = registerBlock("pamlettuceCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamscallionCrop = registerBlock("pamscallionCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamartichokeCrop = registerBlock("pamartichokeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambrusselsproutCrop = registerBlock("pambrusselsproutCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcabbageCrop = registerBlock("pamcabbageCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamspinachCrop = registerBlock("pamspinachCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwhitemushroomCrop = registerBlock("pamwhitemushroomCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambeanCrop = registerBlock("pambeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsoybeanCrop = registerBlock("pamsoybeanCrop", ItemBlockFruit.class, new BlockPamCrop());
		pambellpepperCrop = registerBlock("pambellpepperCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamchilipepperCrop = registerBlock("pamchilipepperCrop", ItemBlockFruit.class, new BlockPamCrop());
		pameggplantCrop = registerBlock("pameggplantCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamokraCrop = registerBlock("pamokraCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampeasCrop = registerBlock("pampeasCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamtomatoCrop = registerBlock("pamtomatoCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcottonCrop = registerBlock("pamcottonCrop", ItemBlockFruit.class, new BlockPamCrop());
		pampineappleCrop = registerBlock("pampineappleCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamgrapeCrop = registerBlock("pamgrapeCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamkiwiCrop = registerBlock("pamkiwiCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcranberryCrop = registerBlock("pamcranberryCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamriceCrop = registerBlock("pamriceCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamseaweedCrop = registerBlock("pamseaweedCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamcurryleafCrop = registerBlock("pamcurryleafCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamsesameseedsCrop = registerBlock("pamsesameseedsCrop", ItemBlockFruit.class, new BlockPamCrop());
		pamwaterchestnutCrop = registerBlock("pamwaterchestnutCrop", ItemBlockFruit.class, new BlockPamCrop());
		
		pamApple = registerBlock("pamApple", ItemBlockFruit.class, new BlockPamFruit());
		pamappleSapling = new BlockPamSapling("apple_sapling");
		pamAlmond  = registerBlock("pamAlmond", ItemBlockFruit.class, new BlockPamFruit());
		pamalmondSapling = new BlockPamSapling("almond_sapling");
		pamApricot = registerBlock("pamApricot", ItemBlockFruit.class, new BlockPamFruit());
		pamapricotSapling = new BlockPamSapling("apricot_sapling");
		pamAvocado = registerBlock("pamAvocado", ItemBlockFruit.class, new BlockPamFruit());
		pamavocadoSapling = new BlockPamSapling("avocado_sapling");
		pamBanana = registerBlock("pamBanana", ItemBlockFruit.class, new BlockPamFruit());
		pambananaSapling = new BlockPamSapling("banana_sapling");
		pamCashew = registerBlock("pamCashew", ItemBlockFruit.class, new BlockPamFruit());
		pamcashewSapling = new BlockPamSapling("cashew_sapling");
		pamCherry = registerBlock("pamCherry", ItemBlockFruit.class, new BlockPamFruit());
		pamcherrySapling = new BlockPamSapling("cherry_sapling");
		pamChestnut = registerBlock("pamChestnut", ItemBlockFruit.class, new BlockPamFruit());
		pamchestnutSapling = new BlockPamSapling("chestnut_sapling");
		pamCinnamon = registerBlock("pamCinnamon", ItemBlockFruit.class, new BlockPamLogFruit());
		pamcinnamonSapling = new BlockPamSapling("cinnamon_sapling");
		pamCoconut = registerBlock("pamCoconut", ItemBlockFruit.class, new BlockPamFruit());
		pamcoconutSapling = new BlockPamSapling("coconut_sapling");
		pamDate = registerBlock("pamDate", ItemBlockFruit.class, new BlockPamFruit());
		pamdateSapling = new BlockPamSapling("date_sapling");
		pamDragonfruit = registerBlock("pamDragonfruit", ItemBlockFruit.class, new BlockPamFruit());
		pamdragonfruitSapling = new BlockPamSapling("dragonfruit_sapling");
		pamDurian = registerBlock("pamDurian", ItemBlockFruit.class, new BlockPamFruit());
		pamdurianSapling = new BlockPamSapling("durian_sapling");
		pamFig = registerBlock("pamFig", ItemBlockFruit.class, new BlockPamFruit());
		pamfigSapling = new BlockPamSapling("fig_sapling");
		pamGooseberry = registerBlock("pamGooseberry", ItemBlockFruit.class, new BlockPamFruit());
		pamgooseberrySapling = new BlockPamSapling("gooseberry_sapling");
		pamGrapefruit = registerBlock("pamGrapefruit", ItemBlockFruit.class, new BlockPamFruit());
		pamgrapefruitSapling = new BlockPamSapling("grapefruit_sapling");
		pamLemon = registerBlock("pamLemon", ItemBlockFruit.class, new BlockPamFruit());
		pamlemonSapling = new BlockPamSapling("lemon_sapling");
		pamLime = registerBlock("pamLime", ItemBlockFruit.class, new BlockPamFruit());
		pamlimeSapling = new BlockPamSapling("lime_sapling");
		pamMaple = registerBlock("pamMaple", ItemBlockFruit.class, new BlockPamLogFruit());
		pammapleSapling = new BlockPamSapling("maple_sapling");
		pamMango = registerBlock("pamMango", ItemBlockFruit.class, new BlockPamFruit());
		pammangoSapling = new BlockPamSapling("mango_sapling");
		pamNutmeg = registerBlock("pamNutmeg", ItemBlockFruit.class, new BlockPamFruit());
		pamnutmegSapling = new BlockPamSapling("nutmeg_sapling");
		pamOlive  = registerBlock("pamOlive", ItemBlockFruit.class, new BlockPamFruit());
		pamoliveSapling = new BlockPamSapling("olive_sapling");
		pamOrange = registerBlock("pamOrange", ItemBlockFruit.class, new BlockPamFruit());
		pamorangeSapling = new BlockPamSapling("orange_sapling");
		pamPapaya = registerBlock("pamPapaya", ItemBlockFruit.class, new BlockPamFruit());
		pampapayaSapling = new BlockPamSapling("papaya_sapling");
		pamPaperbark = registerBlock("pamPaperbark", ItemBlockFruit.class, new BlockPamLogFruit());
		pampaperbarkSapling = new BlockPamSapling("paperbark_sapling");
		pamPeach = registerBlock("pamPeach", ItemBlockFruit.class, new BlockPamFruit());
		pampeachSapling = new BlockPamSapling("peach_sapling");
		pamPear = registerBlock("pamPear", ItemBlockFruit.class, new BlockPamFruit());
		pampearSapling = new BlockPamSapling("pear_sapling");
		pamPecan = registerBlock("pamPecan", ItemBlockFruit.class, new BlockPamFruit());
		pampecanSapling = new BlockPamSapling("pecan_sapling");
		pamPeppercorn = registerBlock("pamPeppercorn", ItemBlockFruit.class, new BlockPamFruit());
		pampeppercornSapling = new BlockPamSapling("peppercorn_sapling");
		pamPersimmon = registerBlock("pamPersimmon", ItemBlockFruit.class, new BlockPamFruit());
		pampersimmonSapling = new BlockPamSapling("persimmon_sapling");
		pamPistachio = registerBlock("pamPistachio", ItemBlockFruit.class, new BlockPamFruit());
		pampistachioSapling = new BlockPamSapling("pistachio_sapling");
		pamPlum = registerBlock("pamPlum", ItemBlockFruit.class, new BlockPamFruit());
		pamplumSapling = new BlockPamSapling("plum_sapling");
		pamPomegranate = registerBlock("pamPomegranate", ItemBlockFruit.class, new BlockPamFruit());
		pampomegranateSapling = new BlockPamSapling("pomegranate_sapling");
		pamStarfruit = registerBlock("pamStarfruit", ItemBlockFruit.class, new BlockPamFruit());
		pamstarfruitSapling = new BlockPamSapling("starfruit_sapling");
		pamVanillabean = registerBlock("pamVanillabean", ItemBlockFruit.class, new BlockPamFruit());
		pamvanillabeanSapling = new BlockPamSapling("vanillabean_sapling");
		pamWalnut = registerBlock("pamWalnut", ItemBlockFruit.class, new BlockPamFruit());
		pamwalnutSapling = new BlockPamSapling("walnut_sapling");
		
		PamTemperateSaplings = new Block[] { pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, pampearSapling, pamplumSapling, pamwalnutSapling, pamgooseberrySapling };
		PamWarmSaplings = new Block[] { pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling, pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling };
		PamLogSaplings = new Block[] { pamcinnamonSapling, pammapleSapling, pampaperbarkSapling };
	}
	
}
