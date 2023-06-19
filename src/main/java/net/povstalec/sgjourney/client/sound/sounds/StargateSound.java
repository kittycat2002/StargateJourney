package net.povstalec.sgjourney.client.sound.sounds;

import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.povstalec.sgjourney.common.block_entities.stargate.AbstractStargateEntity;

public abstract class StargateSound extends AbstractTickableSoundInstance
{
	protected AbstractStargateEntity stargate;
	
	protected StargateSound(AbstractStargateEntity stargate, SoundEvent soundEvent, SoundSource soundSource, RandomSource randomSource)
	{
		super(soundEvent, soundSource, randomSource);
		this.stargate = stargate;
		this.x = stargate.getBlockPos().getX();
		this.y = stargate.getBlockPos().getY();
		this.z = stargate.getBlockPos().getZ();
		this.relative = true;
	}
	
	@Override
	public void tick()
	{
		if(!(stargate instanceof AbstractStargateEntity))
			this.stop();
	}
	
	public void stopSound()
	{
		this.stop();
	}
}