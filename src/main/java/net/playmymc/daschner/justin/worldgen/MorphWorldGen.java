package net.playmymc.daschner.justin.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.playmymc.daschner.justin.morph;
import cpw.mods.fml.common.IWorldGenerator;

public class MorphWorldGen implements IWorldGenerator 
{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			//Generate Surface World
			generateSurface(world, random, chunkX*16, chunkZ*16);
		case -1:
			//Generate Nether World
			generateNether(world, random, chunkX*16, chunkZ*16);
		case 1:
			//Generate End World
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		this.addNetherOreSpawn(morph.solusOre, world, random, i, j, 16, 16, 2+random.nextInt(6), 25, 6, 96);		
	}

	private void generateSurface(World world, Random random, int i, int j) 
	{
		//this.addOreSpawn(Ore, World, Random, x, y, chunkArea, chunkArea, min+Max vein size, chance %, minHeight, maxHeight);
		this.addOreSpawn(morph.graliteOre, world, random, i, j, 16, 16, 2+random.nextInt(6), 25, 6, 36);
		this.addOreSpawn(morph.ladiusOre, world, random, i, j, 16, 16, 2+random.nextInt(6), 6, 6, 30);
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) 
	{
		for(int i = 0; i < chanceToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}
	
	private void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

}
