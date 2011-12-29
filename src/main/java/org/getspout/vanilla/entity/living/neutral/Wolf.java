package org.getspout.vanilla.entity.living.neutral;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entity.AnimalEntity;
import org.getspout.vanilla.entity.NeutralEntity;
import org.getspout.vanilla.mobs.MobID;

public class Wolf extends AnimalEntity implements NeutralEntity {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata(MobID.KEY, new MetadataStringValue(MobID.Wolf.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}

}