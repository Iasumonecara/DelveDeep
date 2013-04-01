package iasumonecara.DelveDeep.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hammer extends Item {

        public Hammer(int id) {
                super(id);
                
                // Constructor Configuration
                maxStackSize = 64;
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("Hammer");
        }
        

        public void updateIcons(IconRegister iconRegister) {
        	iconIndex = iconRegister.registerIcon("DelveDeep:Hammer");
        }     

       }