package iasumonecara.DelveDeep.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ACDCConverter extends Item {

        public ACDCConverter(int id) {
                super(id);
                
                // Constructor Configuration
                maxStackSize = 64;
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("ACDCConverter");
        }
        

        public void updateIcons(IconRegister iconRegister) {
        	iconIndex = iconRegister.registerIcon("DelveDeep:ACDCConverter");
        }     

       }