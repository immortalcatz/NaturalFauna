package com.ikerleon.naturalfaunamod.init;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.NaturalFaunaMain;
import com.ikerleon.naturalfaunamod.entity.EntityAvocet;
import com.ikerleon.naturalfaunamod.entity.EntityCamel;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityCourser;
import com.ikerleon.naturalfaunamod.entity.EntityGreySeal;
import com.ikerleon.naturalfaunamod.entity.EntityHyena;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	private static int id = 0;
	
	public static void register() {
		registerEntity();
	}

	private static void registerEntity() {
		createEntity(EntityPuffin.class, "atlantic_puffin");
		createEntity(EntityCourser.class, "cream-coloured_courser");
		createEntity(EntityAvocet.class, "avocet");
		createEntity(EntityCamel.class, "camel");
		createEntity(EntityGreySeal.class, "grey_seal");
		createEntity(EntityHyena.class, "spotted_hyena");
		createEntity(EntityCantabricCapercaillie.class, "cantabric_capercaillie");
	}
	
	private static void createEntity(Class entityClass , String entityName) {
		EntityRegistry.registerModEntity(new ResourceLocation(NFReference.MOD_ID + ":" + entityName), entityClass, entityName, id++, NaturalFaunaMain.instance, 50, 1, true);
		NaturalFaunaMain.addAnimal(entityClass);
	}

}
