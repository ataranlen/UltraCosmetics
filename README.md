# 1.11 Update
Was having a whole lot of issues, my initial patch to make everything work with 1.11 seemed fine until you actually tried to do anything like summon a pet or mount. This version here has now fixed a lot of those issues but at the expense of working on past versions of minecraft. The version you see here in the master branch is for 1.11 and 1.11 only unfortunately.

Wither pet, pumpling pet, christmas elf pet, wither morph, elder guardian morph, and most of the mounts are currently bugged.

Gadgets work fine, particle effects work fine, all pets and morphs except those mentioned above work fine, hats fork wine, emotes work fine, and suits work fine! 

Changing the version from 2.3.9 to CODENAME PLATYPUS will cause problems, you've been warned. ;)

# UltraCosmetics
UltraCosmetics is a Spigot 1.8.8/1.9.x/1.10 plugin which adds cool cosmetics for your server hub.

You must use Spigot, and not CraftBukkit for this plugin!

THE (“UltraCosmetics”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“UltraCosmetics”) SOURCE IS STRICTLY PROHIBITED.

Adding a new Cosmetics is really simple.
Create your GadgetType, PetType, etc.. In the enum file located in the corresponding cosmetic package.

Create the file extending Gadget/Pet/etc... and make your gadget. (you can have a look to other gadgets if you don't
know how to do)

Done! :)

Nightly Builds: http://ci.isach.be/job/UltraCosmetics/
