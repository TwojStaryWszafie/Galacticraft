package micdoodle8.mods.galacticraft.core.tile;

import micdoodle8.mods.galacticraft.api.vector.BlockVec3;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IMultiBlock
{
    /**
     * Called when activated
     */
    public boolean onActivated(EntityPlayer entityPlayer);

    /**
     * Called when this multiblock is created
     *
     * @param placedPosition - The position the block was placed at
     */
    public void onCreate(World world, BlockPos placedPosition);

    /**
     * Called when one of the multiblocks of this block is destroyed
     *
     * @param callingBlock - The tile entity who called the onDestroy function
     */
    public void onDestroy(TileEntity callingBlock);
}
