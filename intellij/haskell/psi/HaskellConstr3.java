// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellConstr3 extends HaskellCompositeElement {

  @NotNull
  List<HaskellCname> getCnameList();

  @NotNull
  List<HaskellGtycon> getGtyconList();

  @NotNull
  HaskellQcon getQcon();

  @NotNull
  List<HaskellQvar> getQvarList();

  @NotNull
  List<HaskellQvarOp> getQvarOpList();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

  @NotNull
  List<HaskellUnpackNounpackPragma> getUnpackNounpackPragmaList();

}
