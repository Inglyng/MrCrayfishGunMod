package com.mrcrayfish.guns.proxy;

import com.mrcrayfish.guns.client.render.entity.RenderProjectile;
import com.mrcrayfish.guns.entity.EntityProjectile;
import com.mrcrayfish.guns.event.GunRenderEvent;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy
{
	@Override
	public void preInit() 
	{
		MinecraftForge.EVENT_BUS.register(new GunRenderEvent());
		RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, RenderProjectile::new);
	}
	
	@Override
	public void init()
	{

	}

	@Override
	public void spawnParticle(EnumParticleTypes type, boolean ignoreRange, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
	{
		//World world = Minecraft.getMinecraft().world;
	}
}
