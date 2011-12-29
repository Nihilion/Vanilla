package org.getspout.vanilla.protocol.msg;

import org.getspout.api.io.nbt.Tag;
import org.getspout.api.protocol.Message;

import java.util.Map;

public final class SetWindowSlotMessage extends Message {
	private final int id, slot, item, count, damage;
	private final Map<String, Tag> nbtData;

	public SetWindowSlotMessage(int id, int slot) {
		this(id, slot, -1, 0, 0, null);
	}

	public SetWindowSlotMessage(int id, int slot, int item, int count, int damage, Map<String, Tag> nbtData) {
		this.id = id;
		this.slot = slot;
		this.item = item;
		this.count = count;
		this.damage = damage;
		this.nbtData = nbtData;
	}

	public int getId() {
		return id;
	}

	public int getSlot() {
		return slot;
	}

	public int getItem() {
		return item;
	}

	public int getCount() {
		return count;
	}

	public int getDamage() {
		return damage;
	}

	public Map<String, Tag> getNbtData() {
		return nbtData;
	}

	@Override
	public String toString() {
		return "SetWindowSlotMessage{id=" + id + ",slot=" + slot + ",item=" + item + ",count=" + count + ",damage=" + damage + ",nbtData=" + nbtData + "}";
	}
}