// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellDefaultDeclaration extends HaskellDeclarationElement {

  @NotNull
  List<HaskellTtype> getTtypeList();

  @Nullable
  HaskellTypeSignature getTypeSignature();

}
