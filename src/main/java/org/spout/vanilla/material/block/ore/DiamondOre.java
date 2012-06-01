/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011-2012, VanillaDev <http://www.spout.org/>
 * Vanilla is licensed under the SpoutDev License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.vanilla.material.block.ore;

import org.spout.api.inventory.ItemStack;

import org.spout.vanilla.material.InitializableMaterial;
import org.spout.vanilla.material.Mineable;
import org.spout.vanilla.material.TimedCraftable;
import org.spout.vanilla.material.VanillaMaterials;
import org.spout.vanilla.material.block.Ore;
import org.spout.vanilla.material.block.controlled.Furnace;
import org.spout.vanilla.material.item.tool.Pickaxe;
import org.spout.vanilla.material.item.tool.Tool;
import org.spout.vanilla.util.MiningType;

public class DiamondOre extends Ore implements TimedCraftable, Mineable, InitializableMaterial {
	public DiamondOre(String name, int id) {
		super(name, id);
		this.setHardness(3.0F).setResistance(5.0F).setMiningType(MiningType.PICKAXE).setMiningLevel(MiningType.MiningLevel.IRON);
	}

	@Override
	public void initialize() {
		this.setDropMaterial(VanillaMaterials.DIAMOND);
	}

	@Override
	public ItemStack getResult() {
		return new ItemStack(VanillaMaterials.DIAMOND, 1);
	}

	@Override
	public float getCraftTime() {
		return Furnace.SMELT_TIME;
	}

	@Override
	public short getDurabilityPenalty(Tool tool) {
		return tool instanceof Pickaxe ? (short) 1 : (short) 2;
	}
}
